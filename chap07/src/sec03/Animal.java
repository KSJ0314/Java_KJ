package sec03;

public abstract class Animal {

	public String kind; // ���� ����

	public void breathe() { // �Ϲ� �޼ҵ�
		System.out.println("���� ���ϴ�.");
	}

	public abstract void sound(); // �߻� �޼ҵ�, ����Ŭ�������� ���� ����(�������̵�)

}