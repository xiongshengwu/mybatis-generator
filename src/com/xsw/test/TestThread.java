package com.xsw.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class TestThread {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

//		Runnable run = new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println(Thread.currentThread().getName()+"-"+ 123);
//			}
//		};
//		for (int i = 0; i < 10; i++) {
//			new Thread(run).start();
//		}
//		List<String> list =  getMonthBetween("2015-07", "2016-02");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//格式化为年月
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse("2017-07-01"));
		//c.add(Calendar.MONTH, 0);//上个月
		c.set(Calendar.DAY_OF_MONTH,1);
		System.out.println(sdf.format(c.getTime()));
		
		c.set(Calendar.DAY_OF_MONTH,c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(sdf.format(c.getTime()));
		// TODO Auto-generated method stub
				Scanner in =new Scanner(System.in);
				System.out.println("Hello,World");
				String a;
				a=in.nextLine();
				System.out.println("Vincent："+a);
				System.out.println("Lily:I am fine.Thank you.");
	}

	
	private static List<String> getMonthBetween(String minDate, String maxDate) throws ParseException {
	    ArrayList<String> result = new ArrayList<String>();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");//格式化为年月

	    Calendar min = Calendar.getInstance();
	    Calendar max = Calendar.getInstance();

	    min.setTime(sdf.parse(minDate));
	    min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);
	    max.setTime(sdf.parse(maxDate));
	    max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);
	    Calendar curr = min;
	    while (curr.before(max)) {
	     result.add(sdf.format(curr.getTime()));
	     curr.add(Calendar.MONTH, 1);
	    }

	    return result;
	  } 
}