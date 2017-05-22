package com.sravan.executorpool;

import com.sravan.csvreader.Reader;

public class WorkerThread implements Runnable {
	  
    private String[] command;
    
    public WorkerThread(String[] detail){
        this.command=detail;
    }

    public void run() {
    	Reader r = new Reader();
    	r.detailPopulate(command);
    }


    @Override
    public String toString(){
        return this.command.toString();
    }
}