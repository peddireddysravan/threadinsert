package com.sravan.csvreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.sravan.connection.ConnectDB;
import com.sravan.executorpool.WorkerThread;
import com.sravan.thread.ThreadScheduler;

public class Reader {

	public void csvFileParser(){
		String csvFile = "C:\\Users\\Sravan\\Desktop\\trail\\abc1.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

ExecutorService executor = Executors.newFixedThreadPool(5);
   
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

            	

                // use comma as separator
                String[] detail = line.split(cvsSplitBy);

                
                    Runnable worker = new WorkerThread(detail);
                    executor.execute(worker);
                
                
             
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


	public void detailPopulate(String[] detail) {
		// TODO Auto-generated method stub
		
		new ConnectDB().connection(detail);
		
	}
}
