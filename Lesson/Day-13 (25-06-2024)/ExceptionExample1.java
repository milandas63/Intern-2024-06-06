package com.exception;

public class ExceptionExample1 {

	public static void main(String[] args) {
		int n = 25;
		int q = 0;
		String name = "IIG Varsity";
		int j = 25;
		char vowels[] = {'A','E','I','O','U','a','e','i','o','u'};
		int index = 11;
		
		for(int i=0; i<3; i++) {
			try {
				System.out.println(n/q);
				System.out.println(name.charAt(j));
				System.out.println(vowels[index]);
			} catch(NullPointerException e) {
			} catch(ClassCastException e) {
			} catch(MyException e) {
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Out Of Bounds Exception "+e);
				index = 6; i--;
			} catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception "+e);
				q = 5; i--;
			} catch(StringIndexOutOfBoundsException e) {
				System.out.println("String Index Out Of Bounds Exception "+e);
				j = 7; i--;
			}
		}
	}
}

class MyException extends RuntimeException {
	
}