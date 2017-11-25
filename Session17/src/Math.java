
public class Math {

	int findAbsoluteValue(int num) {

		int absolute;
		if (num < 0) {
			absolute = num * -1;
		} else {
			absolute = num * 1;
		}
		return absolute;
	} 
	
int	getMaximumValue(int num1, int num2){
	int max;
	
	if(num1 > num2) {
		max = num1;
		
	}else {
		max = num2;
	}
	return max;
}
}

