package sec01;

public class MyPointExample {

	public static void main(String[] args) {

		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		int a = 10;
		System.out.println(p);
		
		if (p.equals(q)) {
			System.out.println("같은점");
		} else {
			System.out.println("다른점");
		}
		
	}

}
