package ��ӿ�������.Q4;

public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("ȫ�浿", "�ڹ�");
		dic.put("��浿", "���̽�");
		dic.put("��浿", "C");
		dic.put("�̱浿", "C");
		dic.put("�ڱ浿", "C");
		dic.put("���浿", "C");
		System.out.println("ȫ�浿�� ���� " + dic.get("ȫ�浿"));
		System.out.println("��浿�� ���� " + dic.get("��浿"));
		dic.delete("ȫ�浿");
		System.out.println("ȫ�浿�� ���� " + dic.get("ȫ�浿"));

		System.out.println(dic.length());
		dic.put("�ֱ浿", "C");
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(dic.KeyArray[i]);
		}

		System.out.println(dic.length());
	}

}
