package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		/*예제
		public static void main(String[] agrgs) { --> agrgs가 아니라 args이다.
			
			int x,y= 0;				--> 변수는 ,를 사용하지 말아야 한다.
			char grade = "A";		--> char를 사용할 때 "" 가 아니라 ''를 사용한다.
			int salary = 2,000,000;	--> 값에 쉼표를 넣지 말아야 한다.
			byte n =1000;			--> byte는 -128에서 127까지만 표현할 수 있다.
		}
		*/
		
		int x = 0;
		int y = 0;
		
		char grade = 'A';
		
		int salary = 2000000;
		
		long n = 1000;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(grade);
		System.out.println(salary);
		System.out.println(n);
		
	}

}
