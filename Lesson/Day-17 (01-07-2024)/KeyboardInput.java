package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class KeyboardInput {
	BufferedReader reader;
	Writer writer;
	
	public KeyboardInput() {
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("text.txt")));

			boolean yesNo = true;
			while(yesNo) {
				for(int i=0; i<20; i++) System.out.println();
				System.out.println("STUDENT INFORMATION SYSTEM");
				System.out.println("--------------------------");
				System.out.println();
				
				System.out.print("Candidate's name: ");
				String name = reader.readLine();
				
				System.out.print("Father's name:    ");
				String father = reader.readLine();

				System.out.print("Gender [M/F]:     ");
				String gender = reader.readLine();
				
				System.out.println();
				System.out.print("More [Y/N]: ");
				String more = reader.readLine();

				yesNo = more.startsWith("Y");
			}
			
			
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		}
	}

	public static void main(String[] args) {
		new KeyboardInput();
	}

}
