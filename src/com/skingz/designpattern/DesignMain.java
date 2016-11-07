package com.skingz.designpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DesignMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("design pattern examples....");
		System.out.println("you can input the order number of the patterns to show the example:");
		System.out.println("and input '0' to exit this application");

		String inputStr="";
		while(!"0".equals(inputStr)){
			inputStr=readDataFromConsole();
			System.out.println(inputStr);
		}		
	}
	private static String readDataFromConsole() {  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try {str = br.readLine();} 
		catch (IOException e) {e.printStackTrace();}
		return str;
	}

}
