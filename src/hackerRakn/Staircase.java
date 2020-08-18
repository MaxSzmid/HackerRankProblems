package hackerRakn;

public class Staircase {
	/*
	 * Nombre del ejercico :SStaircase dificultad: EZ* objetivo: dibijar un arbolito
	 * con # con espacios de por medio y cantidad variable
	 */
	public static void main(String[] args) {
		int contadorDeVueltas = 1;
		int n = 6, flag = n-1;
		// Se ejecuta segun la cantidad de altera que tenga el arbol si el arbol es n=
		// 5, pasa 5 veces el algoritmo
		for (int i = 0; i < n; i++) {

			// imprime cada piso del arbol
			for (int j = 0; j < contadorDeVueltas; j++) {
				// Imprime los primeros espacios
				if (j == 0) {

					for (int j2 = 0; j2 < flag; j2++) {
						System.out.print(" ");
					}
				}

				System.out.print("#");

			}
			for (int j2 = 0; j2 < flag; j2++) {
				System.out.print(" ");
			}
			flag--;
			contadorDeVueltas++;
			System.out.println();

		}
	}
}
