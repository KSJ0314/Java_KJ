package sec03.exam01;

import java.util.Scanner;

public class PromotionExample2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("한 글자를 입력하세요 : ");
		String a = s.next();
		char b = a.charAt(0);
		int c = b;
		System.out.println("입력하신 \'" + b + "\'의 유니코드 값은 " + c + "입니다.");
		
	}

}
