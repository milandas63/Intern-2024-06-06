package com.modifiers;

public class StaticExample {
	public String name = "Rajeev Gandhi";
	public static String child = "Rahul Gandhi";
	
	public static void main(String[] args) {
		StaticExample s1 = new StaticExample();
		StaticExample s2 = new StaticExample();
		StaticExample s3 = new StaticExample();

		System.out.println("S1: "+s1.name+"  "+s1.child);
		System.out.println("S2: "+s2.name+"  "+s2.child);
		System.out.println("S3: "+s3.name+"  "+s3.child);
		
		s2.name = "Jawaharlal Nehru";
		s2.child = "Indira Gandhi";

		System.out.println("S1: "+s1.name+"  "+s1.child);
		System.out.println("S2: "+s2.name+"  "+s2.child);
		System.out.println("S3: "+s3.name+"  "+s3.child);
	}
}
