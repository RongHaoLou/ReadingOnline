package reading;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import util.DateUtil;

public class TestDate {
	public static void main(String[] args) {
		/*Date commentTime =new Date("Wed Jun 26 10:17:49 CST 2019");
		//Wed Jun 26 10:17:49 CST 2019
		String formateDate = DateUtil.formateDate(commentTime,"yyyy-MM-dd HH:mm:ss");
		System.out.println(formateDate);
		Date date=new Date("2019-06-27 00:17:49");
		System.out.println(date.toString());
		Date parseDate = DateUtil.parseDate("yyyy-MM-dd HH:mm:ss", formateDate);
		
		System.out.println(parseDate.toString());*/
		String strDate = "2016-07-06 10:17:48";  
        SimpleDateFormat lsdStrFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        try {  
            Date strD = lsdStrFormat.parse(strDate);  
            System.out.println(strD);  
        } catch (ParseException e) {  
            e.printStackTrace();  
        }
	}
}
