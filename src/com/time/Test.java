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
		
		//设置常量 4月30日
		ReturndaysInt.MYMONTH = MYMONTH-1;//这里减一是因为Calendar里面月份0代表1月
		ReturndaysInt.MYDATE = MYDATE;
		rightNow2 = ReturndaysInt.settime(rightNow);
		int targetTime = ReturndaysInt.returndaysInt(rightNow2);
		//重新初始化时间，计算今天在全年的位置
		rightNow = Calendar.getInstance();
		int nowTime = ReturndaysInt.returndaysInt(rightNow);
		System.out.println(targetTime);
		System.out.println(nowTime);
		System.out.println("倒计时是"+(targetTime-nowTime)+"天");
		return targetTime-nowTime;
	}
}