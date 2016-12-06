package com.hanbit03_1;

//161206 (1)

public class FirstClass {

	//멤버변수(초기화 안 해줘도 초기값을 가짐 int는 0, boolean은 flase, 나머지는 null)
	int number ;
	int sum;
	
	//생성자 (만든 클래스와 이름이 같은 메소드)
	 FirstClass(int number) {
		 this.number = number;	//this.number 이 가르키는 건 멤버변수number
	 }
	
	int getNumber() {
		return number;
	}
	
	int addNumber(int add) {
		number += add;
		
		int sum = number;
		this.sum = sum;		//this.sum 이 가르키는 건 멤버변수sum
		
		return sum;
		
	}
}
