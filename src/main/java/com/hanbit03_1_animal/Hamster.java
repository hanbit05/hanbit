package com.hanbit03_1_animal;

//161206 (6)

public class Hamster extends Animal {	//Animal클래스로부터 상속받음

	public static final String DEFAULT_NAME = "햄토리";
	
	//생성자
	public Hamster(String kind, String color) {
		this(DEFAULT_NAME, kind, color);
	}
		
	public Hamster(String name, String kind, String color) {
		super(name, kind, color);	//상속받는 부모의(상위클래스) 생성자 사용
	}
		
		
	//Animal클래스의 abstract메소드 구현을 여기서 해야함.
	@Override
	protected String getDefaultName() {	//getDefaultName() 메소드
		return DEFAULT_NAME;
	}
}
