package sec03;

public abstract class Phone {
	public String owner;

	public Phone(String owner) {
		this.owner = owner;
	}

	public void trunOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	public void trunOff() {
		System.out.println("폰 전원을 끕니다.");
	}

}
