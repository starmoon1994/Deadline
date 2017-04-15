package com.time;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;

public class TimeSet {
		static int MYYEAR = 2017;
		static int MYMONTH = 0;//5月要写4，1月写0
		static int MYDATE = 10;
		
	//设置对象的时间，然后返回一个时间字符串
			/**
			 * public final void set(int year,
	                      int month,
	                      int date)
			 * 设置日历字段 YEAR、MONTH 和 DAY_OF_MONTH 的值。
			 * @param args
			 * @return 
			 */
			public Calendar settime(Calendar c){
				
				c.set(MYYEAR, MYMONTH, MYDATE);
				return c;
//				Date date = c.getTime();
//				return date.toString();
				
				
			}
			
			
			
			
/*			public static void main(String[] args) {
				Calendar rightNow = Calendar.getInstance();
				TimeTarget t = new TimeTarget();
				System.out.println(t.settime(rightNow));
				TimeNow timenow = new TimeNow();
				System.out.println(timenow.returndays(rightNow));
				
			}*/
	
	
	
}
