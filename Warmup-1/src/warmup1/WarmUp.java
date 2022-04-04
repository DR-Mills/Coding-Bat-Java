package warmup1;

public class WarmUp {

	
	public static void main(String[] args) {
		

	}

	// exercises from https://codingbat.com
	
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

	// diff21
	public static int diff21(int n) {
		if (n > 21) {
			return Math.abs(2* (21-n));
		}
		return 21-n;
	}

	// parrotTrouble
	public static boolean parrotTrouble(boolean talking, int hour) {
		if (talking == true && (hour < 7 || hour >20)) {
			return true;
		}
		return false;
	}
	
	// makes10
	public static boolean makes10(int a, int b) {
		if ((a == 10 || b == 10) || (a + b == 10)) {
			return true;
		}
		return false;
	}
	
	// nearHundred
	public static boolean nearHundred(int n) {
		if (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10) {
			return true;
		}
		return false;
	}
	
	//posNeg
	public static boolean posNeg(int a, int b, boolean negative) {
		if (negative == true) {
			if (a < 0 && b < 0) {
				return true;
			}
			return false;
		}
		if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
			return true;
		}
		return false;
	}
	
	
	
}
































