import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Give the number of laps you ran");
	Scanner s1 = new Scanner(System.in);
	int numberOfLaps = s1.nextInt();
   int totalTime = 0;
    for (int i = 0; i < numberOfLaps; i=i+1)
    {
    	System.out.println("How much time did you take for lap "+ (i+1)+ " in minutes");
    	int currentTime = new Scanner(System.in).nextInt();
    	totalTime = totalTime+currentTime;
    }
		System.out.println("You took " + totalTime +  " minutes for total number of " +numberOfLaps + " laps");
	}
}

