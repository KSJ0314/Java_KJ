package sec01;

import java.util.Scanner;

public class if연습4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("num : ");
		int num = s.nextInt();

		if (num % 3 == 0 && num != 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}

	}

}
