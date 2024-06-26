package com.misc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Today {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);

		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf.format(now));

		String days[] = {"","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		sdf = new SimpleDateFormat("w-a-hh:mm-ss");
		System.out.println(sdf.format(now));
	}

}
