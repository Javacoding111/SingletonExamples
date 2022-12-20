package com.test;

public class MultithreadingCheck {
	
	private MultithreadingCheck() {
		
	}
	
	private static MultithreadingCheck instance;
	
	public static MultithreadingCheck getInstance() {
		if(instance == null) {
			synchronized (MultithreadingCheck.class) {
				if(instance == null) {
					instance = new MultithreadingCheck();
				}
			}
		}
		return instance;
	}

}
