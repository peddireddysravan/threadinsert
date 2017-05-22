package com.sravan.startmain;

import com.sravan.csvreader.Reader;

public class StartOfProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis( );
		new Reader().csvFileParser();
		long end = System.currentTimeMillis( );
        long diff = end - start;
        System.out.println("Difference is : " + diff);
        
	}

}
