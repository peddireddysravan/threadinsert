package com.sravan.connection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Trail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Trail t = new Trail();
t.invokeTrail();

	}

	private void invokeTrail() {
		// TODO Auto-generated method stub
		Method n = null;
		int l=9;
		try {
			n = this.getClass().getMethod("invoking"+"0",int.class);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			n.invoke(this,l);
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
	public void invoking0(int j){
		System.out.println("Hello"+j);
	}

}
