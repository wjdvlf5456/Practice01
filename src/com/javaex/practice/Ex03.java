package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2; // x값이 1오르고 나서 그후에 2를 곱하면 a=4가 된다.
		int b = y++ *2;	// y값이 오르지 않고 2를 곱하여 b=2가 된다.
		
		System.out.println("a=" + a);
		//예상: a=4	""이 들어가면 그냥 문장이니 a=이 먼저 오고 그 이후에 위에서 구한 값인 4가 온다.
		System.out.println("b=" + b);
		//예상: b=2	""이 들어가면 그냥 문장이니 b=이 먼저 오고 그 이후에 위에서 구한 값인 2가 온다.
		System.out.println("x=" + x);
		//예상: x=3	x앞에 ++이 있었으니 +1을 하면 x=3 
		System.out.println("y=" + y);
		//예상: y=2	y뒤에 ++이 붙었으니 1+1은 2 고로 y=2 
		
	}

}
