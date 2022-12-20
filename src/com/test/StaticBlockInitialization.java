package com.test;

public class StaticBlockInitialization {
	
	private StaticBlockInitialization() {
		
	}
	
	private static StaticBlockInitialization instance;
	
	static {
		instance = new StaticBlockInitialization();
	}
	
	public static StaticBlockInitialization getInstance() {
		return instance;
	}

}
