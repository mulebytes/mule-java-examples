package com.mulebytes.java;

public class InvokeNonStaticJavaFromMule {
	public String returnMessage(String name) {
		String osName = System.getProperty("os.name");
		return "Hi My Name is " + name + ", Running in OS: " + osName;
	}
}
