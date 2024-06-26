package com.exception;

public class PrintVoterIdCard {

	public static void main(String[] args) {
		int[] ages = {25,95,77,42,-1,35,56,0,61,11,13,98};
		
		//for(int i=0; i<ages.length; i++) {
		for(int i:ages) {
			try {
				checkAge(i);
				System.out.println(i + " is a valid age");
			} catch(NegativeAgeException e) {
				System.out.println(i + " " + e.getMessage());
			} catch(ZeroAgeException e) {
				System.out.println(i + " " + e.getMessage());
			} catch(TooYoungAgeException e) {
				System.out.println(i + " " + e.getMessage());
			} catch(TooOldAgeException e) {
				System.out.println(i + " " + e.getMessage());
			}
		}
	}
	
	public static void checkAge(int age) throws NegativeAgeException, 
	                                            ZeroAgeException, 
	                                            TooYoungAgeException, 
	                                            TooOldAgeException {
		if(age<0) throw new NegativeAgeException("Age is less than zero");
		else if(age==0) throw new ZeroAgeException("Age is zero");
		else if(age<16) throw new TooYoungAgeException("Age is less than 16");
		else if(age>90) throw new TooOldAgeException("Age is greater than 90");
	}

}
