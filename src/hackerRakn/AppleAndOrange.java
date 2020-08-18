package hackerRakn;


public class AppleAndOrange {
	/*
	 * Nombre del ejercico :Apple and Orange dificultad: EZ* objetivo: Calcular la
	 * caida de frutas en el patio de una casa. Link al
	 * ejercicio:https://www.hackerrank.com/challenges/apple-and-orange/problem?
	 * isFullScreen=false
	 * 
	 */
	// All test Passed
	public static void main(String[] args) {
		int startAreaOfTheHome, endAreaOftheHome, threeApplePosition, threeOrangePosition, cuantityOfApples = 0,
				cuantityOfOrange = 0;
		int apples[] = new int[3], orange[] = new int[2];
		startAreaOfTheHome = 7;
		endAreaOftheHome = 11;
		threeApplePosition = 5;
		threeOrangePosition = 15;
		apples[0] = 7;
		apples[1] = 3;
		apples[2] = 4;
		orange[0] = 3;
		orange[1] = -200;
		
		for (int i = 0; i < apples.length; i++) {
			// The apples falls on the home if this equals true
			if (isBetween((threeApplePosition + apples[i]), startAreaOfTheHome, endAreaOftheHome)) {
				cuantityOfApples++;
			}
		}

		for (int i = 0; i < orange.length; i++) {
			// The oranges falls on the home if this equals true
			if (isBetween((threeOrangePosition + orange[i]), startAreaOfTheHome, endAreaOftheHome)) {
				cuantityOfOrange++;
			}
		}

		System.out.println(cuantityOfApples);
		System.out.println(cuantityOfOrange);

	}

	public static boolean isBetween(int threePlusFall, int startAreaOfTheHome, int endAreaOftheHome) {
		return threePlusFall >= startAreaOfTheHome && threePlusFall <= endAreaOftheHome;
	}

}