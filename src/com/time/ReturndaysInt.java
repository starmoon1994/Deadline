package com.time;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;

public class ReturndaysInt  extends TimeSet{
		
		
		//���� ���ض�����ȫ���ǵڼ���
		public int returndaysInt(Calendar rightNow){
			int days = 0;
			
			Date date = rightNow.getTime();
			String s = String.format("%tj", date);//��ѯdate�����ǵ��������
			days = Integer.parseInt(s);
			return days;
		}



	
}
