package com.hanbit03_1_animal;

//161206 (4)
//161207

import org.apache.commons.lang3.StringUtils;
import com.Creature;

public abstract class Animal implements Creature {

	public static final String DEFAULT_NAME = "무명이";
	
	protected String name;
	protected String kind;
	protected String color;
	
	//생성자
	public Animal(String name, String kind, String color) {
		this.name = name;
		this.kind = kind;
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return name + ":" + kind + ":" + color;
	}
	
	@Override
	public void breathe() {				//인터페이스 Breathable에서 정의한 breathe()를 구현
		System.out.println("산소 -> 이산화탄소");	
	}
	
	@Override
	public boolean isLive() {			//인터페이스 Livable에서 정의한 isLive()를 구현
		return true;
	}
	
	
	//캡슐화
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(StringUtils.isBlank(name)) {
			name = getDefaultName();	//getDefaultName()메소드
		}
		
		this.name = name;
	}
	//getDefaultName() 메소드
	protected abstract String getDefaultName() ;	//abstract: 추상메소드 (부를 수는 있지만 구현은 여기서 하지x, 상속받는 클래스가 대신 구현함)

	
	
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
