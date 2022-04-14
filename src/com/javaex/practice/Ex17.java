package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		double radius = sc.nextDouble();
		
		double pi = 3.14;
		double vol = (double)4/3*pi*radius*radius*radius;
		
		System.out.println("구의 부피는: "+vol+"입니다.");
		
		sc.close();
		
		
	}

}
