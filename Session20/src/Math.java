
public class Math {

	static int addNumbers(int num1, int num2) {
		int z = num1 + num2;
		return z;
	}

	static int findAbsoluteValue(int num1) {
		int result;
		
		if (num1 > 0) {
			result = num1 * 1;
		} else {
			result = num1 * -1;
		}
		
		return result;
	}

int previousNumber;

int addSpecial(int num1) {
	int answer;
	answer = previousNumber + num1;
	previousNumber = answer;
			return answer;
}
	
}