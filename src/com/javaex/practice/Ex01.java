package com.javaex.practice;

public class Ex01 {
	
	public static void main(String[] args) {
		
		//int true;						--> true는 예약어라 변수로 사용이 불가능하다.
		int x = 10;
		System.out.println(x);
		
		//int #_of_workers;				--> 변수에 $나 _ 이외에 특수문자는 사용할 수 없다.
		int ofworkers= 3;
		System.out.println(ofworkers);
		
		//int countOfLettersLnString;		--> 예약어인 String이 있어 사용이 불가하고 변수에 대문자를 사용해도 되지만 암묵적으로 소문자로 사용하고 너무 길지 않게 작성해준다.
		int countletter = 4;
		System.out.println(countletter);
		
		//int 1stLevel1;					--> 변수에는 맨 앞에 숫자를 사용할 수 없다. 
		int stLevel1 = 53;
		System.out.println(stLevel1);
		
		//int person#;					--> 변수에 $나 _ 이외에 특수문자는 사용할 수 없다.
		int person = 21;
		System.out.println(person);
		
		//int _person;					--> 사용할 수 있다.
		int _person = 11;
		System.out.println(_person);
	}

}
