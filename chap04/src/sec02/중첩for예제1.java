package sec02;

import java.util.Scanner;

public class ��øfor����1 {

	public static void main(String[] args) {

//		for (int i = 2; i <= 9; i++) {
//			System.out.printf("*** %d�� ***\n", i);
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d * %d = %d\n", i, j, i * j);
//			}
//			System.out.println();
//		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
