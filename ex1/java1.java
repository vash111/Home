package ex1;

import java.util.Scanner;

public class java1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연봉을 입력하세요 (숫자만 가능) : ");
		
		int pay = sc.nextInt();
		
		double tax;
		
		if(pay < 0) { 
			System.out.println("잘못된 입력입니다.");
		}else if (pay <= 12000000) {
			tax = 0.06;
		}else if (pay <= 46000000) {
			tax = 0.15;
		}else if (pay <= 88000000) {
			tax = 0.24;
		}else if (pay <= 150000000) {
			tax = 0.35;
		}else if (pay <= 300000000) {
			tax = 0.38;
		}else {
			tax = 0.40;
		}
		
		double truepay = pay * tax;
		
		System.out.printf("연봉: %,d원, 세금: %d원%n", pay , (int)truepay);
	}

}
