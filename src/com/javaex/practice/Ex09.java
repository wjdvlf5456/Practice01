package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {

		/*예제
		double f = 80.0;
		System.out.println(5/9*(f-32.0));
		
		
		결과값이 0.0이 나오는 이유는 5/9가 정수형인 int로 취급되어 값이 0으로 나와 아무리 곱해도 0이 되기 때문이다.
		그래서 해결할 때 괄호로 실수형을 넣어준다.
		*/
		
		double f = 80.0;
		double c = (double)5/9*(f-32.0);
		
		System.out.println(c);
		
		
	}

}
