package com.sravan.connection;

public class Single {
private final static  Single obj =new Single();

 

public static Single getObj() {

	return obj;
}


public static void main(String[] args) {
	Single s= Single.getObj();
	Single s1= Single.getObj();
	System.out.println(s);
	System.out.println(s1);
	
}
}

