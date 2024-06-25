package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

	public static void main(String[] args) throws ClassNotFoundException {
		String name = "java.lang.String";
		Class obj = Class.forName(name);
		Field f[] = obj.getDeclaredFields();
		Constructor c[] = obj.getDeclaredConstructors();
		Method m[] = obj.getDeclaredMethods();
		
		System.out.println(name);
		for(int i=0; i<name.length(); i++) System.out.print("-");
		System.out.println();
		
		if(f.length>0) {
			System.out.println("FIELDS: ");
			for(int i=0; i<f.length; i++) {
				//System.out.println((i+1)+": "+f[i]);
				System.out.println((i+1)+": "+suppress(f[i].toString()));
			}
		}
		if(c.length>0) {
			System.out.println("CONSTRUCTORS: ");
			for(int i=0; i<c.length; i++) {
				//System.out.println((i+1)+": "+c[i]);
				System.out.println((i+1)+": "+suppress(c[i].toString()));
			}
		}
		if(m.length>0) {
			System.out.println("METHODS: ");
			for(int i=0; i<m.length; i++) {
				//System.out.println((i+1)+": "+m[i]);
				System.out.println((i+1)+": "+suppress(m[i].toString()));
			}
		}
	}

	private static String suppress(String line) {
		StringBuffer retval = new StringBuffer();
		boolean yn = true;
		char c;
		for(int i=0; i<line.length(); i++) {
			c = line.charAt(i);
			switch(c) {
			case '.': yn = false; break;
			case ' ': yn = true; break;
			case ',': yn = true; break;
			case '(': yn = true; break;
			case ')': yn = true; break;
			case '[': yn = true; break;
			case ']': yn = true; break;
			}
			if(yn) {
				retval.append(c);
			}
		}
		return retval.toString();
	}
}
