package hackerRakn;

public class NeiceBirthday {
	/*
	 * Nombre del ejercico :Birthday Cake Candles
	 * 
	 * dificultad: EZ* objetivo: Tu sobrina solo puede soplar la vela con el numero
	 * mas alto de la torta, si tenes 4,4,3,1 puede soplar 2 de las 4 velas, solo
	 * las 2 que valen 4.
	 */
	public static void main(String[] args) {
		int array[] = new int[10];
		array[0] = 18;
		array[1] = 90;
		array[2] = 90;
		array[3] = 13;
		array[4] = 90;
		array[5] = 75;
		array[6] = 90;
		array[7] = 8;
		array[8] = 90;
		array[9] = 43;
		int velaQuePuedeSoplar = array[0], cantidadVelasQuePuedeSoplar = 0;
		for (int i = 0; i < array.length; i++) { 
			if (array[i] >= velaQuePuedeSoplar) {
				velaQuePuedeSoplar = array[i];
				// System.out.println("El numero es " + array[i]);
			}

		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == velaQuePuedeSoplar) {
				cantidadVelasQuePuedeSoplar++;

			}
		}
		System.out.println("La cantidad de velas que puede soplar es " + cantidadVelasQuePuedeSoplar);
	}

}
