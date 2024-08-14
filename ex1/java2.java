package ex1;

import java.util.Scanner;

public class java2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이름 입력해주세요 : ");
		
		int age = sc.nextInt();
		int pay = 0;
		
		if(age < 5) {
			pay = 0;
		}else if (age <= 12) {
			pay = 4000;
		}else if (age <= 18) {
			pay = 6000;
		}else if (age <= 64) {
			pay = 10000;
		}else {
			pay = 0;
		}
		
		System.out.printf("나이 : %d , 요금 : %d원" , age , pay);
	}

}
