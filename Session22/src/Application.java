
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] favNum = new int[5];

		favNum[0] = 13;
		favNum[4] = 17;

		for (int x = 0; x < 5; x = x + 1) {
			System.out.println(favNum[x]);
		}

		String[] name = new String[5];
		name[0] = "Bhavika";
		name[2] = "Srinidhi is idiot";
		
		for(int x = 0; x<5; x = x+1) {
			System.out.println(name[x]);		
		}

		boolean[] girl = new boolean[5];
		girl[1] = true;
		girl[3] = true;
		
		for(int x = 0; x<5; x = x+1) {
			System.out.println(girl[x]);

		}
				
			
	}

}
