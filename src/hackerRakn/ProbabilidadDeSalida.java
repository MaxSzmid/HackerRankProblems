package hackerRakn;

/*Nombre del ejercico
 * plusMinus
 * dificultad: EZ*
 * objetivo: calcular la probabilidad de salida de un numero en un array */
public class ProbabilidadDeSalida {

	public static void main(String[] args) {

	}

	public void plusMinus(int arr[]) {
		int denominador = arr.length;
		float negative = 0, positive = 0, empty = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				negative++;
			} else if (arr[i] == 0) {
				empty++;
			} else {
				positive++;
			}

		}
		positive = positive / denominador;
		negative = negative / denominador;
		empty = empty / denominador;
		System.out.println(positive);
		System.out.println(negative);
		System.out.println(empty);
	}

}
