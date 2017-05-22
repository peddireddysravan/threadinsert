package com.sravan.thread;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Time;

import com.sravan.csvreader.Reader;

public class ThreadScheduler extends Thread {

	private String[] detail;

	public String[] getDetail() {
		return detail;
	}

	public void setDetail(String[] detail) {
		this.detail = detail;
	}

	public void run() {

		Reader.detailPopulate(getDetail());

	}

	public void getNumber(int num, String[] detail2) {
		String methodName = "thread" + num;
		Method n = null;
		try {
			n = this.getClass().getMethod(methodName, String[].class);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			n.invoke(this, new Object[]{detail2});
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void thread1(String[] detail) {

		setDetail(detail);
		ThreadScheduler t1 = new ThreadScheduler();
		t1.start();

	}

	public void thread2(String[] detail) {

		setDetail(detail);
		ThreadScheduler t2 = new ThreadScheduler();
		t2.start();

	}

	public void thread3(String[] detail) {

		setDetail(detail);
		ThreadScheduler t3 = new ThreadScheduler();
		t3.start();

	}

	public void thread4(String[] detail) {

		setDetail(detail);
		ThreadScheduler t4 = new ThreadScheduler();
		t4.start();

	}

	public void thread5(String[] detail) {

		setDetail(detail);

		ThreadScheduler t5 = new ThreadScheduler();
		t5.start();

	}

	public void thread6(String[] detail) {

		setDetail(detail);

		ThreadScheduler t6 = new ThreadScheduler();
		t6.start();

	}

	public void thread7(String[] detail) {

		setDetail(detail);

		ThreadScheduler t7 = new ThreadScheduler();
		t7.start();

	}

	public void thread8(String[] detail) {

		setDetail(detail);

		ThreadScheduler t8 = new ThreadScheduler();
		t8.start();

	}

	public void thread9(String[] detail) {

		setDetail(detail);
		ThreadScheduler t9 = new ThreadScheduler();
		t9.start();

	}

	public void thread0(String[] detail) {

		setDetail(detail);
		ThreadScheduler t0 = new ThreadScheduler();
		t0.start();

	}

}
