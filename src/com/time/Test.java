package com.time;

import java.util.Calendar;
import java.util.Date;


public class Test {

	public String currentTime(){
		Calendar CalendarNow = Calendar.getInstance();
		Date date = CalendarNow.getTime();
		return date.toString();
	}

	

	public  int deadlineDays(int MYMONTH,int MYDATE) {
		Calendar rightNow = Calendar.getInstance();
		Calendar rightNow2 = Calendar.getInstance();
		
		ReturndaysInt ReturndaysInt = new ReturndaysInt();
		
		//���ó��� 4��30��
		ReturndaysInt.MYMONTH = MYMONTH-1;//�����һ����ΪCalendar�����·�0����1��
		ReturndaysInt.MYDATE = MYDATE;
		rightNow2 = ReturndaysInt.settime(rightNow);
		int targetTime = ReturndaysInt.returndaysInt(rightNow2);
		//���³�ʼ��ʱ�䣬���������ȫ���λ��
		rightNow = Calendar.getInstance();
		int nowTime = ReturndaysInt.returndaysInt(rightNow);
		System.out.println(targetTime);
		System.out.println(nowTime);
		System.out.println("����ʱ��"+(targetTime-nowTime)+"��");
		return targetTime-nowTime;
	}
}