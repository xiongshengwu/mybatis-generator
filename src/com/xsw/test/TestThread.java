package com.xsw.test;

public class TestThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName()+"-"+ 123);
			}
		};
		for (int i = 0; i < 10; i++) {
			new Thread(run).start();
		}
		
	}

}
