/**
 * 
 */
package com.mulebytes.java;

/**
 * @author jagadishwar.chitluri
 *
 */
public class InvokeJavaFromMule {
	public static String returnMessage(String name) {
		String osName = System.getProperty("os.name");
		return "Hi My Name is " + name + ", Running in OS: " + osName;
	}
}
