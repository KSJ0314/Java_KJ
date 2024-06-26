package sec01;

public class MyClass {
	
	//필드
	RemoteControl rc = new Television();

	// 디폴트 생성자
	public MyClass() {
	}

	// 인터페이스를 매개변수로 하는 생성자
	// 매개변수 객체의 메소드 호출
	public MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
	
	// Audio 객체의 메소드 호출
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
	
	// 매개변수 객체의 메소드 호출
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
	
	
}
