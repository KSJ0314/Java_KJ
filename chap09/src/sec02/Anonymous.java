package sec02;

public class Anonymous {
	
	Worker worker = new Worker() {

		@Override
		public void start() {
			System.out.println("디자인을 합니다.");
		}
		
	};
	
	void method1() {
		Worker localworker = new Worker() {

			@Override
			public void start() {
				System.out.println("개발을 합니다.");
			}
			
		};
		localworker.start();
	}
	
	void method2(Worker worker) {
		worker.start();
	}

}
