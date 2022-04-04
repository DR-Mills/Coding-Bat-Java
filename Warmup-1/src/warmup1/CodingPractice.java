package warmup1;

public class CodingPractice {

	public static void main(String[] args) {
		
		System.out.println(sleepIn(true, true));
		
	}

	
	// sleepIn
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		if (weekday == false || vacation == true) {
			return true;
		}
		return false;
	}
	
	// monkeyTrouble
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)) {
			return true;
		}
		return false;
	}
	
	// sumDouble
	public static int sumDouble(int a, int b) {
		if (a == b) {
			return (a+b) * 2;
		} else {
			return a + b;
		}
	}
}
