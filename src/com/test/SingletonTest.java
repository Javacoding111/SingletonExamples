package com.test;

public class SingletonTest {
	
	public static void main(String[] args) {
//		EagerSingleton instance1 = EagerSingleton.getInstance();
//		EagerSingleton instance2 = EagerSingleton.getInstance();
		
//		StaticBlockInitialization instance1 = StaticBlockInitialization.getInstance();
//		StaticBlockInitialization instance2 = StaticBlockInitialization.getInstance();
		
//		LazyInitialization instance1 = LazyInitialization.getInstance();
//		LazyInitialization instance2 = LazyInitialization.getInstance();
		
//		MultithreadingCheck instance1 = MultithreadingCheck.getInstance();
//		MultithreadingCheck instance2 = MultithreadingCheck.getInstance();
		
		BillPughSingleton instance1 = BillPughSingleton.getInstance();
		BillPughSingleton instance2 = BillPughSingleton.getInstance();
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		
	}

}
