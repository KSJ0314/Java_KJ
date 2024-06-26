package 클래스연습문제;

import java.util.Scanner;

public class PhoneBook2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("인원수를 입력하세요 : ");
		int num = s.nextInt();
		Phone2[] phone = new Phone2[num];

		for (int i = 0; i < num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) : ");
			phone[i] = new Phone2(s.next(), s.next());
		}
		System.out.println("저장되었습니다.");

		while (true) {
			System.out.print("검색할 이름 : ");
			String inputName = s.next();
			int i;
			if (inputName.equals("중지")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			for (i = 0; i < num; i++) {
				if (phone[i].name.equals(inputName)) {
					System.out.println(inputName+"의 전화번호는 " + phone[i].phoneNum + "입니다.");
					break;
				}
			}
			if (i == num) {
				System.out.println(inputName + "이 없습니다.");
			}
		}

	}

}
