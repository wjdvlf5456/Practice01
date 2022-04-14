package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		long lightspeed = 300000;
		long lightyear = year*lightspeed*365*24*60*60l; 
		
		System.out.println("빛이 "+year+"년 동안 가는 거리는 "+lightyear+" km 입니다.");
		
		sc.close();

	}

}
