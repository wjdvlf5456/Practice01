package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격: ");
		int price = sc.nextInt();
		
		System.out.print("받은돈: ");
		int cash = sc.nextInt();
		
		
		System.out.println("============================");
		
		
		System.out.print("받은돈: ");
		double dcash = (double)cash;
		System.out.println(dcash);
		
		System.out.print("상품가격: ");
		double dprice = (double)price;
		System.out.println(dprice);
		
		System.out.print("부가세: ");
		System.out.println(dprice/10);
		
		System.out.print("잔액: ");
		System.out.println(dcash-dprice);
		
		sc.close();

	}

}
