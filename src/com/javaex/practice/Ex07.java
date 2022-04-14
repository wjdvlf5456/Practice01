package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {
		
		int i = 10;				//i는 int가 정수를 나타내므로 그대로 10일 것이다.
		int n = ++i %2;			//i앞에 ++가 와있으므로 10+1=11 --> 11%2는 1이므로 int n 은 1이다. 
		
		//예상 i= 10, n= 1
		//정답 i= 11  n= 1
		System.out.println(i);
		System.out.println(n);
		
		//int n 에서 i는 11이 되었으므로 출력값은 11이다.
		
		
		//Ex06과 다르게 i앞에 ++이 오므로 n의 값이 바뀌었다.

	}

}
