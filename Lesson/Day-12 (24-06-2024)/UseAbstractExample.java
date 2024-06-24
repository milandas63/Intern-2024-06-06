package com.modifiers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UseAbstractExample extends AbstractExample {
    public void getNumber() {
    	System.out.println("The number is awesome");
    }

	public static void main(String[] args) throws IOException {
		AbstractExample uae = new UseAbstractExample();
		uae.getNumber();
		
		InputStream in = new FileInputStream("");
		
	}

}
