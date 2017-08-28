
public class Car {
	String name;
	int power;
boolean hasStarted1 = false;
	void start()
	{
		if(hasStarted1)
		{
			System.out.println("Error--you have already started the " + name + ". Please stop before starting again.");
		}
		else
		{
			System.out.println("Starting the " + name);
			hasStarted1 = true;
		}
	}

	void stop()
	{
		if(hasStarted1) 
		{
			System.out.println("Stopping the " + name);
			hasStarted1 = false;
		}
	else
		System.out.println("Error--please start the car before stopping");
	

	}

}