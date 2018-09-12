package com.afrianpasa.singletonpattern.objects;

public class SingleObject {
	private static SingleObject instance = new SingleObject();
	private SingleObject() {}
	
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hellowwww...!");
	}
}
