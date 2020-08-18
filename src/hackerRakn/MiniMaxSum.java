package hackerRakn;

public class MiniMaxSum {
	/*
	 * * Nombre del ejercico :Mini-Max Sum dificultad: EZ* objetivo: DE un vector de
	 * 5 valores, el valor mas grande que se puede sumar entre 4 de los 5 numeros y
	 * el valor\ mas chico que se puede sacar sumando 4 de los 5 numeros
	 */
	public static void main(String[] args) {
	
		int array[] = new int[5];
		array[0] = 396285104;
		array[1] = 573261094;
		array[2] = 759641832;
		array[3] = 819230764;
		array[4] = 364801279;	
		
		int flagMin = 0, flagMax = 0;
		long  sumatoria = 0;
		flagMin = array[0];

		for (int i = 0; i < array.length; i++) {
			// obtengo el menor numero
			if (flagMin > array[i]) {
				flagMin = array[i];
				// obtengo el menor numero
			} else if (flagMax < array[i]) {
				flagMax = array[i];
			}
		}
		//suma todo...
		for (int i = 0; i < array.length; i++) {
			sumatoria += array[i];
		}
		
		System.out.println((sumatoria - flagMax) + " " + (sumatoria- flagMin));
	}

}
