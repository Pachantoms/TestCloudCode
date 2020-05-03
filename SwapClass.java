package com.learn.tdd3.tdd3;

public class SwapClass {

	public String swapfn(String s) {
		int len = s.length();
		if(len <= 2) {
			return s;
		}
		System.out.println(len);
		char first = s.charAt(len-1); //E  2-1
		char second = s.charAt(len-2); //D  2-2
		//ABCDE -> DECAB - 
		
		String substr = s.substring(2,len-2); //2 , 2-2
		
		return "" + second + first + substr + s.charAt(0) + s.charAt(1);
		
		
	}
}
