package com.sravan.csvreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.sravan.connection.ConnectDB;

public class Reader {

	public void csvFileParser(){
		String csvFile = "C:\\Users\\Sravan\\Desktop\\trail\\abc1.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {


                // use comma as separator
                String[] detail = line.split(cvsSplitBy);

                detailPopulate(detail);

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

	private void detailPopulate(String[] detail) {
		// TODO Auto-generated method stub
		
		new ConnectDB().connection(detail);
		
	}
}
