package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.prototype.IAuthorDao;
import dao.prototype.IBookDao;
import dao.prototype.IChapterDao;
import dao.prototype.ICommentDao;
import dao.prototype.IOrderDao;
import dao.prototype.IPublishDao;
import dao.prototype.ITypeDao;
import dao.prototype.ITypesDao;
import entity.Author;
import entity.Book;
import entity.Chapter;
import entity.Comment;
import entity.Order;
import entity.Publish;
import entity.Type;
import entity.Types;
import entity.User;
import util.DateUtil;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.config.*;

@Controller
public class BookController {
	@Autowired
	private IBookDao bookDao;
	@Autowired
	private IAuthorDao autorDao;
	@Autowired
	private IPublishDao publishDao;
	@Autowired
	private ITypeDao typeDao;
	@Autowired
	private ITypesDao typesDao;
	@Autowired
	private ICommentDao commentDao;
	@Autowired
	private IChapterDao chapterDao;
	@Autowired
	private IOrderDao iOrderDao;

	@RequestMapping("/book")
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ModelAndView mv = new ModelAndView();
		String bookName = request.getParameter("bookName");
		System.out.println(bookName);
		if (bookName == null) {
			mv.setViewName("/jsp/index/searchFail");
			return mv;
		} else {
			bookName = new String(bookName.getBytes("iso-8859-1"), "utf-8");
			// 获取书的信息
			Book book = bookDao.findByName(bookName);
			if (book == null) {
				mv.setViewName("/jsp/index/searchFail");
				return mv;
			} else {
				// 获取十本书
				List<Book> findPaged = bookDao.findPaged(0, 10);
				List<Chapter> chapters = chapterDao.findByBookId(book.getId());

				int authorId = book.getAuthorId();
				Author autorById = autorDao.findById(authorId);
				// 获取作者姓名
				String autorName = autorById.getAuthorName();
				// 获取出版社姓名
				int publishId = book.getPublishId();
				Publish publishById = publishDao.findById(publishId);
				// 获取公司姓名
				String publishName = publishById.getPublishName();
				String Copyright = publishById.getCopyright();
				// 获取大类型名称
				int typesId = book.getTypesId();
				Types typesById = typesDao.findById(typesId);
				String typesName = typesById.getTypesName();
				// 获取小类型名称
				int typeId = book.getTypeId();
				Type typeById = typeDao.findById(typeId);
				String typeName = typeById.getTypeName();
				// 获取该书的评论
				int bookId = book.getId();

				// 获取评论的条数
				List<Comment> allComments = commentDao.findByBookId(bookId);
				request.setAttribute("allComments", (allComments.size()));
				// 只获取前十条评论
				List<Comment> comments = commentDao.findPaged(bookId, 0, 10);

				if (comments.size() == 0) {
					request.setAttribute("flag", true);
				} else {
					request.setAttribute("flag", false);

				}
				// 获取按照一页十条评论的页数
				int pageNum = commentDao.pageNum(bookId, 10);
				request.setAttribute("pageNum", pageNum);
				// System.out.println(pageNum);
				request.setAttribute("comments", comments);
				// 书的原价
				double bookPrice = book.getBookPrice();
				bookPrice *= 2;
				BigDecimal bg = new BigDecimal(bookPrice);
				bookPrice = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
				response.setContentType("textml;charset=utf-8");
				request.setAttribute("autorName", autorName);
				request.setAttribute("publishName", publishName);
				request.setAttribute("Copyright", Copyright);
				request.setAttribute("typesName", typesName);
				request.setAttribute("typeName", typeName);
				request.setAttribute("bookPrice", bookPrice);
				request.setAttribute("chapters", chapters);
				request.setAttribute("book", book);
				request.setAttribute("findPaged", findPaged);
				request.setAttribute("bookId", bookId);
				mv.setViewName("/jsp/book/book");
				return mv;
			}

		}
	}

	@RequestMapping("/Bookcomment")
	public ModelAndView getComments(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// List<Comment> comments
		String size = req.getParameter("pageSize");
		size = new String(size.getBytes("iso-8859-1"), "utf-8");
		int pageSize = Integer.parseInt(size);
		String bookName = req.getParameter("bookName");
		bookName = new String(bookName.getBytes("iso-8859-1"), "utf-8");
		// 获取书的信息
		Book book = bookDao.findByName(bookName);
		int bookId = book.getId();
		// 1 0 2 10 3 20
		int offset = 0;
		if (pageSize >= 1) {
			offset = (pageSize - 1) * 10;
		}
		List<Comment> comments = commentDao.findPaged(bookId, offset, 10);

		// List<Comment> comments = commentDao.findPaged(2, 0,10);
		// System.out.println("接收到的页数为:"+"("+pageSize+")");
		ModelAndView mv = new ModelAndView();
		if (comments.size() == 0) {
			mv.addObject("flag", true);
		} else {
			mv.addObject("flag", false);
		}
		mv.addObject("comments", comments);
		mv.setViewName("/jsp/book/comments");
		// System.out.println("实际查询的值为:"+offset);
		// pt.print(mv);
		return mv;
	}

	@RequestMapping("/buyBook")
	public ModelAndView buyBook(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		Object attribute = req.getSession().getAttribute("user");
		User user = (User) attribute;
		if (user == null) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("/jsp/loginAndRegister/login");
			return mv;

		} else {
			String bookName = req.getParameter("bookName");

			bookName = new String(bookName.getBytes("iso-8859-1"), "utf-8");

			Book findByName = bookDao.findByName(bookName);
			double bookPrice = findByName.getBookPrice();
			req.setAttribute("bookName", bookName);
			req.setAttribute("bookPrice", bookPrice);

			ModelAndView mv = new ModelAndView();
			mv.setViewName("/jsp/book/index");
			System.out.println(bookName);
			System.out.println(bookPrice);
			return mv;
		}

	}

	@RequestMapping("/dingdan")
	public ModelAndView dingDan(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, AlipayApiException {
		User attribute = (User) req.getSession().getAttribute("user");
		System.out.println("woshisession" + attribute);
		// 获得初始化的AlipayClient
		AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id,
				AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key,
				AlipayConfig.sign_type);

		// 设置请求参数
		AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();

		alipayRequest.setReturnUrl(AlipayConfig.return_url);
		alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
		// 商户订单号，商户网站订单系统中唯一订单号，必填
		String out_trade_no = new String(req.getParameter("WIDout_trade_no").getBytes("ISO-8859-1"), "UTF-8");
		// 付款金额，必填
		String total_amount = new String(req.getParameter("WIDtotal_amount").getBytes("ISO-8859-1"), "UTF-8");
		// 订单名称，必填
		String subject = new String(req.getParameter("WIDsubject").getBytes("ISO-8859-1"), "UTF-8");
		// 商品描述，可空
		String body = new String(req.getParameter("WIDbody").getBytes("ISO-8859-1"), "UTF-8");

		alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\"," + "\"total_amount\":\"" + total_amount
				+ "\"," + "\"subject\":\"" + subject + "\"," + "\"body\":\"" + body + "\","
				+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
		// 请求
		String result = alipayClient.pageExecute(alipayRequest).getBody();
		System.out.println(result);
		req.setAttribute("result", result);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/jsp/book/saomiao");
		
		return mv;

	}

	@RequestMapping("/notify_url")
	public void notify_url(HttpServletRequest req, HttpServletResponse resp)
			throws UnsupportedEncodingException, AlipayApiException {
		/*
		 * * 功能：支付宝服务器异步通知页面 日期：2017-03-30 说明：
		 * 以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
		 * 该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
		 ************************* 
		 * 
		 * 页面功能说明************************* 创建该页面文件时，请留心该页面文件中无任何HTML代码及空格。
		 * 该页面不能在本机电脑测试，请到服务器上做测试。请确保外部可以访问该页面。 如果没有收到该页面返回的 success
		 * 建议该页面只做支付成功的业务逻辑处理，退款的处理请以调用退款查询接口的结果为准。
		 */

		// 获取支付宝POST过来反馈信息
		Map<String, String> params = new HashMap<String, String>();
		Map<String, String[]> requestParams = req.getParameterMap();
		for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
			}
			// 乱码解决，这段代码在出现乱码时使用
			valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
			params.put(name, valueStr);
		}

		boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset,
				AlipayConfig.sign_type); // 调用SDK验证签名

		// ——请在这里编写您的程序（以下代码仅作参考）——

		/*
		 * 实际验证过程建议商户务必添加以下校验： 1、需要验证该通知数据中的out_trade_no是否为商户系统中创建的订单号，
		 * 2、判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额），
		 * 3、校验通知中的seller_id（或者seller_email)
		 * 是否为out_trade_no这笔单据的对应的操作方（有的时候，一个商户可能有多个seller_id/seller_email）
		 * 4、验证app_id是否为该商户本身。
		 */
		if (signVerified) {// 验证成功
			// 商户订单号
			String out_trade_no = new String(req.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");

			// 支付宝交易号
			String trade_no = new String(req.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");

			// 交易状态
			String trade_status = new String(req.getParameter("trade_status").getBytes("ISO-8859-1"), "UTF-8");

			if (trade_status.equals("TRADE_FINISHED")) {
				// 判断该笔订单是否在商户网站中已经做过处理
				// 如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
				// 如果有做过处理，不执行商户的业务程序

				// 注意：
				// 退款日期超过可退款期限后（如三个月可退款），支付宝系统发送该交易状态通知
			} else if (trade_status.equals("TRADE_SUCCESS")) {
				// 判断该笔订单是否在商户网站中已经做过处理
				// 如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
				// 如果有做过处理，不执行商户的业务程序

				// 注意：
				// 付款完成后，支付宝系统发送该交易状态通知
			}

		} else {// 验证失败

			// 调试用，写文本函数记录程序运行情况是否正常
			// String sWord = AlipaySignature.getSignCheckContentV1(params);
			// AlipayConfig.logResult(sWord);
		}

		// ——请在这里编写您的程序（以上代码仅作参考）——

	}

	@RequestMapping("/return_url")
	public ModelAndView return_url(HttpServletRequest req, HttpServletResponse resp)
			throws UnsupportedEncodingException, AlipayApiException {
		/*
		 * * 功能：支付宝服务器同步通知页面 日期：2017-03-30 说明：
		 * 以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
		 * 该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
		 ************************* 
		 * 
		 * 页面功能说明************************* 该页面仅做页面展示，业务逻辑处理请勿在该页面执行
		 */
		ModelAndView mv = new ModelAndView();

		// 获取支付宝GET过来反馈信息
		Map<String, String> params = new HashMap<String, String>();
		Map<String, String[]> requestParams = req.getParameterMap();
		for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
			}
			// 乱码解决，这段代码在出现乱码时使用
			valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
			params.put(name, valueStr);
		}
		System.out.println("return:" + params);
		boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset,
				AlipayConfig.sign_type); // 调用SDK验证签名
		System.out.println("return:" + signVerified);
		// ——请在这里编写您的程序（以下代码仅作参考）——
		if (signVerified) {
			// 商户订单号
			String out_trade_no = new String(req.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");

			// 支付宝交易号
			String trade_no = new String(req.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");

			// 付款金额
			String total_amount = new String(req.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8");

			// out.println("trade_no:"+trade_no+"<br/>out_trade_no:"+out_trade_no+"<br/>total_amount:"+total_amount);
			System.out.println("return:" + out_trade_no + "," + trade_no + "," + total_amount);
			req.setAttribute("out_trade_no", out_trade_no);
			req.setAttribute("trade_no", trade_no);
			req.setAttribute("total_amount", total_amount);
			mv.setViewName("/jsp/verify/verify-success");
			/*
			 * User user=(User)req.getSession().getAttribute("user");
			 * System.out.println(user); iOrderDao.saveOrUpdate(new
			 * Order("out_trade_no",new Date(),1,1));
			 */

		} else {
			// out.println("验签失败");
			mv.setViewName("/jsp/verify/verify-fail");
		}
		// ——请在这里编写您的程序（以上代码仅作参考）——

		return mv;
	}
	@RequestMapping("/insertComment")
	public void insertComment(Comment comment,HttpServletRequest req,HttpServletResponse resp) throws IOException{
		commentDao.saveOrUpdate(comment);
		PrintWriter pw = resp.getWriter();
		pw.write("true");
	}
}
