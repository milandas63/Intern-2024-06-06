package com.modifiers;

public class FinalExample {
	public final String name = "Mohan Maggi";
	public final double PI = 3.141;

	public void change() {
		//name = "Biswanath";
	}

	//public final String getInstituteName() {
	public String getInstituteName() {
		return "IIG Varsity";
	}
	
	public static void main(String[] args) {
		
	}

}

class Another extends FinalExample {
	public String getInstituteName() {
		return "KIIT Unversity";
	}
}