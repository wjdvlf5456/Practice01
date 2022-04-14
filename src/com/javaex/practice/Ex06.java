package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		int i = 10;   //--> i를 출력하면 10이 나올것이다.
		int n = i++ %2; //--> 10+1을 먼저하여 11이나오고 11%2를 하면 1이 나온다.---> 틀림 --> ++이 변수뒤에 오므로 i는 10, 그러면 10%2는 0이다.
		//예상 i = 10, n = 1
		//정답 i = 10, n = 0
		
		System.out.println(i);
		System.out.println(n);

	}

}
