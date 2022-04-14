package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("500원 개수:  ");
		int fivehund = sc.nextInt();
		int val500 = 500*fivehund;
		
		System.out.print("100원 개수:  ");
		int onehund = sc.nextInt();
		int val100 = 100*onehund;
		
		
		System.out.print("50원 개수:  ");
		int fifty = sc.nextInt();
		int val50 = 50*fifty;
		
		
		System.out.print("10원 개수:  ");
		int ten = sc.nextInt();
		int val10 = 10*ten;
		
		int price = val10+val50+val100+val500;
		System.out.println("동전의 총합은 "+price+" 원 입니다.");
		sc.close();

	}

}
