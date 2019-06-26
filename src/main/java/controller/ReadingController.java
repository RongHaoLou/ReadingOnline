package controller;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.prototype.IAuthorDao;
import dao.prototype.IChapterDao;
import dao.prototype.IPublishDao;
import dao.prototype.ISectionDao;
import entity.Author;
import entity.Book;
import entity.Chapter;
import entity.Publish;
import entity.Section;
import entity.dto.ChapterContent;
import service.prototype.IBookService;

@Controller
public class ReadingController {
	@Autowired
	private IBookService bookService;
	@Autowired
	private IAuthorDao authorDao;
	@Autowired
	private IPublishDao publishDao;
	@Autowired
	private IChapterDao chapterDao;
	@Autowired
	private ISectionDao sectionDao;

	@RequestMapping("/reading")
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException {
		ModelAndView mv = new ModelAndView();
		String bookName = request.getParameter("bookName");
		bookName = new String(bookName.getBytes("iso-8859-1"), "utf-8");
		Book book = bookService.findByName(bookName);
		// 根据书获取作者的ID
		int authorId = book.getAuthorId();
		Author author = authorDao.findById(authorId);
		// 获取作者姓名
		// 获取出版社ID
		int publishId = book.getPublishId();
		Publish publish = publishDao.findById(publishId);

		double bookPrice = book.getBookPrice();
		bookPrice *= 2;
		BigDecimal bg = new BigDecimal(bookPrice);
		bookPrice = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		response.setContentType("textml;charset=utf-8");
		request.setAttribute("bookPrice", bookPrice);

		//根据书的ID找章
		/*List<Chapter> chapters = chapterDao.findByBookId(book.getId());
		List<ChapterContent> chapterContent=null;
		for (int i = 0; i < chapters.size(); i++) {
			String chapterName = chapters.get(i).getChapterName();
			chapterContent = sectionDao.findContent(book.getBookName(), chapterName);
			System.out.println(chapterContent);
			request.setAttribute("chapterContents"+i, chapterContent);
		}*/
		List<Chapter> chapters = chapterDao.findByBookId(book.getId());
		List<List<ChapterContent>> chapterContents=new ArrayList<>();
		for (int i = 0; i < chapters.size(); i++) {
			String chapterName = chapters.get(i).getChapterName();
			List<ChapterContent> chapterContent = sectionDao.findContent(book.getBookName(), chapterName);
			//System.out.println(chapterContent);
			chapterContents.add(chapterContent);
			
		}
		
		request.setAttribute("chapterContents", chapterContents);
		request.setAttribute("book", book);
		request.setAttribute("author", author);
		request.setAttribute("publish", publish);
		request.setAttribute("chapters", chapters);
		
		
		
		mv.setViewName("/jsp/reading/reading");
		return mv;
	}
}
