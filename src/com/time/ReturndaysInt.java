package com.time;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;

public class ReturndaysInt  extends TimeSet{
		
		
		//函数 返回对象在全年是第几天
		public int returndaysInt(Calendar rightNow){
			int days = 0;
			
			Date date = rightNow.getTime();
			String s = String.format("%tj", date);//查询date对象是当年的天数
			days = Integer.parseInt(s);
			return days;
		}



	
}
