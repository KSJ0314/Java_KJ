package sec02.exam01;

public class VehicleExample {

	public static void main(String[] args) {

		Vehicle vehicle = new Bus();
		vehicle.run();

		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.stop();
		}

	}

}
