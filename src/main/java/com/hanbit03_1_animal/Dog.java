package com.hanbit03_1_animal;

//161206 (3)

import org.apache.commons.lang3.StringUtils;

public class Dog {

	//멤버변수
	public static final String DEFAULT_NAME = "멍멍이"; //static : 클래스 내에서 하나만 존재하도록 
	
	//멤버변수에는 되도록 private혹은 public 써주기	
	private String name;
	private final String kind;	//상수(한 번 초기화하면 바꿀 수 없음)   <-(초기화도 선언할때 혹은 생성자에서만 가능)
	private String color;
	
	
	//생성자
	public Dog(String name, String kind, String color) {
		this.name = name;
		this.kind = kind;
		this.color = color;
	}
	
	public Dog(String kind, String color) {
		/*
		this.name = DEFAULT_NAME;
		this.kind = kind;
		this.color = color;
		*/
		this(DEFAULT_NAME, kind, color);
	}
	
	
	
	//toString()메소드 재정의(오버라이딩)
	@Override
	public String toString() {
		return name + ":" + kind + ":" + color;
	}
	
	
	
	//캡슐화
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(StringUtils.isBlank(name)) {
			name = DEFAULT_NAME;
		}
		
		this.name = name;
	}


	public String getKind() {
		return kind;
	}


	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if(StringUtils.isBlank(color)) {
			return;	//원래값 그대로 리턴
		}
		
		this.color = color;
	}

}
