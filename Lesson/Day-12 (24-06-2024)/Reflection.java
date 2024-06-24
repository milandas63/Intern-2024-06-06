package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

	public static void main(String[] args) throws ClassNotFoundException {
		Class obj = Class.forName("java.lang.String");
		Field f[] = obj.getDeclaredFields();
		Constructor c[] = obj.getDeclaredConstructors();
		Method m[] = obj.getDeclaredMethods();
		
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

}
