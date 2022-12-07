package javaShihum01.test;

import java.util.Scanner;

public class Test03 { // 3번

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] arr = new String[3];
		
		for(int i = 0; i < 3; i++) {
			String info = "";
			
			System.out.print("이름 : ");
			String name_ = sc.nextLine();
			info += name_;
			
			System.out.print("국어 점수 : ");
			String kor_ = sc.nextLine();
			info += "," + kor_;
			
			System.out.print("영어 점수 : ");
			String eng_ = sc.nextLine();
			info += "," + eng_;
			
			System.out.print("수학 점수 : ");
			String mat_ = sc.nextLine();
			info += "," + mat_;
			
			arr[i] = info;
		}
		
		for(int i = 0; i < 3; i++) {
			String cla[] = arr[i].split(",");
			
			String name = cla[0];
			String kor_ = cla[1];
			int kor = Integer.parseInt(kor_);
			String eng_ = cla[2];
			int eng = Integer.parseInt(eng_);
			String mat_ = cla[3];
			int mat = Integer.parseInt(mat_);
			int total = kor + eng + mat;
			double ave = total / 3.0;
			
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n", name, kor, eng, mat, total, ave);
		}
	}

}
