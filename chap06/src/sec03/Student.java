package sec03;

public class Student {
	String name; // �̸�
	int age; // ����
	String studentNumber; // �й�
	String gender; // ����
	String phoneNumber; // ����ó

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student(String name, String studentNumber, String phoneNumber) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.phoneNumber = phoneNumber;
	}

	public Student(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}