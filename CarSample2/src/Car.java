
public class Car {
	String name;
	int power;
	boolean hasStarted1 = false;
	private
	void igniteChamber() {
		System.out.println("Igniting the gas chamber");
	}
	private
	void pumpGas() {
		System.out.println("Pumping the gas");
	}

	void start() {
		if (hasStarted1) {
			System.out.println("Error--you have already started the " + name + ". Please stop before starting again.");
		} else {
			System.out.println("Starting the " + name);
			igniteChamber();
			pumpGas();
			hasStarted1 = true;
		}
	
	}

	void stop() {
		if (hasStarted1) {
			System.out.println("Stopping the " + name);
			hasStarted1 = false;
		} else
			System.out.println("Error--please start the car before stopping");

	}

}