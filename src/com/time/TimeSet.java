package com.time;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;

public class TimeSet {
		static int MYYEAR = 2017;
		static int MYMONTH = 0;//5��Ҫд4��1��д0
		static int MYDATE = 10;
		
	//���ö����ʱ�䣬Ȼ�󷵻�һ��ʱ���ַ���
			/**
			 * public final void set(int year,
	                      int month,
	                      int date)
			 * ���������ֶ� YEAR��MONTH �� DAY_OF_MONTH ��ֵ��
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
