package javaShihum01.test;

import java.util.Scanner;

public class Test01 { // 1번

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String dbId = "hong";
		String dbPwd = "h1234";
		
		System.out.print("아이디 : ");
		String dbId_ = sc.nextLine();
		System.out.print("비밀번호 : ");
		String dbPwd_ = sc.nextLine();
		
		if(dbId_.equals(dbId)) {
			if(dbPwd_.equals(dbPwd)) {
				System.out.println("일치");
			}
			else {
				System.out.println("불일치");
			}
		} else {
			System.out.println("불일치");
		}
	}

}
