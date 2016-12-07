package com.hanbit03_1;

public class Types {

	public static void main(String[] args) {
		
		int num1 = new Integer(4);
		Integer num2 = Integer.parseInt("5");
		
		System.out.println("int 최대값 : " + Integer.MAX_VALUE);
		System.out.println("int 최소값 : " + Integer.MIN_VALUE);
		System.out.println("long 최대값 : " + Long.MAX_VALUE);
		System.out.println("PI : " + Math.PI);
		
		Boolean yesOrNo = true;
		
		if (num1 == 4 && num2 == 5) {
			System.out.println("맞네");
		}
		
		if (yesOrNo) {
			System.out.println("얘도 맞네");
		}
	}
	
}
