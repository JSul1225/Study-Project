package javaShihum01.test;

import java.util.Scanner;

public class Test02 { // 2번

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받을 정수 : ");
		
		int num = sc.nextInt();
		int total = 0;
		
		for(int i = 1; i <= num; i++) {
			total += i;
		}
		
		System.out.println("총합 : " + total);
	}

}
