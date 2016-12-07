package com.hanbit03_1;

//161207 (1)

public class Loop {

	public static void main(String[] args) {

		/*
		 * countDown 함수를 만들어서
		 * 입력받은 숫자부터 0까지 출력하시오.
		 */
		countDown7 (10);

	}
	

	/**
	 * for 사용
	 * @param input
	 */
	static void countDown1(int num) {
		for(int i=0; i>=num; i++) {
			System.out.println(num-i);
		}	
	}
	/**
	 * for 사용 (역순)
	 * @param input
	 */
	static void countDown2(int num) {
		for(int i=num; i>=0; i--) {
			System.out.println(i);
		}	
	}
	
	
	/**
	 * while 사용
	 * @param input
	 */
	static void countDown3(int num) {
		while(num >= 0) {
			System.out.println(num--);
		}
	}
	
	/**
	 * while 사용 (break)
	 * @param input
	 */
	static void countDown4(int num) {
		while(true) {
			System.out.println(num--);
			
			if(num<0) {
				break;
			}
		}
	}
	
	
	/**
	 * 재귀함수(Recursive Function) 사용
	 * @param num
	 */
	static void countDown5(int num) {
		if(num<0) {
			return;
		}
		
		System.out.println(num);
		
		countDown5(--num);	//재기호출 (자기자신을 불러서 계속 루프 돌게 함)
	}
	
	
	/**
	 * for-each 사용
	 * @param num
	 */
	static void countDown6(int num) {
		int[] n = new int[num+1];
		
		for(int i : n) {	//for each문. 콜론 뒤에 리스트나 배열이 옴 , 배열의 길이만큼 반복 됨.
			System.out.println(num--);
		}
	}
	
	static void countDown7(int num) {
		int[] numbers = new int[num+1];
		
		int ii = num;
		
		for(int i : numbers) {
			numbers[ii - num] = num--;
			System.out.print(i + " ");		//i의 초기값은 자동으로 0으로 됨
		}
		
		System.out.println();
		
		for(int i : numbers) {
			
			System.out.print(i + " ");
		}
	}

}
