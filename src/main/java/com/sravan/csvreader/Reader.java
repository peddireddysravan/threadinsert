package com.sravan.csvreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.sravan.connection.ConnectDB;
import com.sravan.thread.ThreadScheduler;

public class Reader {

	public void csvFileParser(){
		String csvFile = "C:\\Users\\Sravan\\Desktop\\trail\\abc1.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
int k=0;
        ThreadScheduler t =new ThreadScheduler();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

            	

                // use comma as separator
                String[] detail = line.split(cvsSplitBy);

                t.getNumber(k,detail);
               k++;
               if(k==10){
            	   k=0;
               }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

	}


	public static void detailPopulate(String[] detail) {
		// TODO Auto-generated method stub
		
		new ConnectDB().connection(detail);
		
	}
}
