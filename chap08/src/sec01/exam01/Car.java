package sec01.exam01;

public interface Car {

	int MIN_SPEED = 0;
	int MAX_SPEED = 200;
	// 상수 필드는 public static final이 자동으로 붙음
	
	void speedUp(int speed);
	void speedDown(int speed);
	// 추상 메소드는 public abstract가 자동으로 붙음
	
}
