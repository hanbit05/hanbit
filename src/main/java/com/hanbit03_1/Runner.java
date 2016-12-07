package com.hanbit03_1;

//161206 (2)

import com.hanbit03_1_animal.Cat;
import com.hanbit03_1_animal.Dog;	//Dog, Cat클래스는 다른 패키지에 있으므로 import해야만 사용가능 
import com.hanbit03_1_animal.Hamster;
import com.Creature;
import com.hanbit03_1_animal.Animal;

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
		System.out.println(dog);	//toString()값이 나옴.
		
		
		System.out.println("------------------");
		dog.sitDown();
		dog.draw();
		dog.standUp();
		
		
		System.out.println("------------------");
		Cat cat = new Cat("길고양이", "줄무늬");
		Cat cat2 = new Cat("페르시안", "흰색");
		cat2.setName(null);
		
		System.out.println(cat);
		System.out.println(cat2);
		
		
		
		System.out.println("------------------");
		Hamster ham = new Hamster("햄스터", "하양");
		System.out.println(ham);
		
		
		
		System.out.println("------------------");
		//상속받는 상위클래스로도 선언이 가능
		Animal cat3 = new Cat("길고양이","줄무늬");
		Object dog3 = new Dog("말티즈", "하양");
		Creature ham2 = new Hamster("햄스터", "주황");
		
		String s1 = (dog2 instanceof Dog) ? "맞습니다" : "아닙니다";	//dog2가 Dog의 인스턴스인가?
		String s2 = (dog2 instanceof Object) ? "맞습니다" : "아닙니다"; //dog2가 Dog의 인스턴스인가?
		String s3 = (cat instanceof Animal) ? "맞습니다" : "아닙니다";	//cat이 Animal의 인스턴스인가?
		String s4 = (ham2 instanceof Creature) ? "맞습니다" : "아닙니다";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(cat3);
		System.out.println(dog3);
		System.out.println(ham2);
	
		
		System.out.println("------------------");
		printType(cat3);
		printType(dog3);
		printType(ham);
		
	}

	
	static void printType(Object obj) {
		if(obj instanceof Dog) {
			System.out.println("강아지");
		}
		else if(obj instanceof Cat) {
			System.out.println("고양이");
		}
		else if(obj instanceof Hamster) {
			System.out.println("햄스터");
		}
		else {
			System.out.println("그 밖에");
		}
		
	}

}
