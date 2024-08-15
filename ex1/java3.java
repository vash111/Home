package ex1;

import java.util.Scanner;

public class java3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요(숫자만 입력가능) : ");
		
		int age =  sc.nextInt();
		int pay = 30000;
		int fee = 0;
		
		if (age <= 5) {
			fee = 0;
		}else if (age <= 12) {
			fee = (int)(pay * 0.5);
		}else if (age <= 18) {
			fee = (int)(pay * 0.75);
		}else if (age <= 64) {
			fee = pay;
		}else {
			fee = 0;
		}
	
		System.out.printf("나이 : " + age + " 입장료 : " + fee);
		
	}

}
