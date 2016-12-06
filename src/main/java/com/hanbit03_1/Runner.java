package com.hanbit03_1;

//161206 (2)

import com.hanbit03_1_animal.Dog;	//Dog클래스는 다른 패키지에 있으므로 import해야만 사용가능 

public class Runner {

	public static void main(String[] args) {
		FirstClass firstClass = new FirstClass(3);
		FirstClass secondClass = new FirstClass(4);	
		
		System.out.println(firstClass.addNumber(5)); 
		System.out.println(firstClass.addNumber(5));
		
		System.out.println(secondClass.getNumber());
		System.out.println(secondClass.addNumber(5));
		System.out.println("------------------");
		
		
		Dog dog = new Dog("해피", "푸들", "하양");
		
		dog.setName("바둑이");
		dog.setColor("갈색");
		
		System.out.println(Dog.DEFAULT_NAME);	//public static이므로 메소드 안 만들어줘도 다른 클래스에서 참조가능
		System.out.println(dog.getName());
		System.out.println(dog.getKind());
		System.out.println(dog.getColor());
			
		System.out.println("------------------");
		Dog dog2 = new Dog("도베르만", "검정");
		System.out.println(dog2.getName());
		System.out.println(dog2.getKind());
		System.out.println(dog2.getColor());
		
		System.out.println("------------------");
		System.out.println(dog);	//toString()값이 나옴
	}
	
}
