package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {
		
		int i = 10;				//i는 int가 정수를 나타내므로 그대로 10일 것이다.
		int n = ++i %2;			//i앞에 ++가 와있으므로 10+1=11 --> 11%2는 1이므로 int n 은 1이다. 
		
		//예상 i= 10, n= 1
		//정답 i=
		System.out.println(i);
		System.out.println(n);

	}

}
