package sec01;

public class CarExample {

	public static void main(String[] args) {

		System.out.println("차가 출발합니다.");

		Thread tr = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 4; i++) {
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
					System.out.println("현재 속도 " + 50 * i + "km");
				}
			}

		});

		tr.start();
		
		for (int i = 0; i < 4; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
			System.out.print("속도를 올립니다. ");
		}
		
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
		System.out.println("차가 멈춥니다.");

	}

}
