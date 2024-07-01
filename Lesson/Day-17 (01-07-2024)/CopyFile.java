package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	String inputFile = "Python.mp4";
	String outputFile = "Py.mp4";
	InputStream in;
	OutputStream out;

	public CopyFile() {
		try {
			File file = new File(inputFile);
			long len = file.length();
			double fivePc = 0.05 * len;
			in = new FileInputStream(inputFile);
			out = new FileOutputStream(outputFile);
			double count = 0;

			int x;
			while( (x=in.read())!=-1 ) {
				out.write(x);
				count++;
				if(count>=fivePc) {
					System.out.print(".");
					count = 0;
				}
				
			}
			out.close();
			in.close();
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		}
	}

	public static void main(String[] args) {
		new CopyFile();
	}

}
