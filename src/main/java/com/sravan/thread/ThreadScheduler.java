package com.sravan.thread;

import java.sql.Time;

import com.sravan.csvreader.Reader;

public class ThreadScheduler extends Thread{

	public void run(){ 
long start = System.currentTimeMillis( );
		
		
		new Reader().csvFileParser();
		
		 long end = System.currentTimeMillis( );
         long diff = end - start;
         System.out.println("Difference is : " + diff);
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long start = System.currentTimeMillis( );
		
		ThreadScheduler t1= new ThreadScheduler();
		t1.start();
		
		/*ThreadScheduler t2= new ThreadScheduler();
		t2.start();*/

	}

}
