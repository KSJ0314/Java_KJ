package sec02;

public class MovieThread extends Thread {


	@Override
	public void run() {
		
		while(true) {
			System.out.println("�������� ����մϴ�. ");
			if (isInterrupted()) {
				System.out.println("������ ����");
				break;
			}
		}
	}
	
	
	
}