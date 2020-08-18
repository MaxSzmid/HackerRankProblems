package hackerRakn;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

	public static void main(String[] args) {
		/*
		 * Nombre del ejercico :GradingStudents
		 * 
		 * dificultad: EZ* objetivo: redondear una nota segun la calificacion
		 */
		List<Integer> gradesIntegers = new ArrayList<>();
		List<Integer> numberIntegers = new ArrayList<>();

		gradesIntegers.add(4);
		gradesIntegers.add(73);
		gradesIntegers.add(67);
		gradesIntegers.add(38);
		gradesIntegers.add(33);
		gradesIntegers.remove(0);
		int originalValue;
		for (Integer list : gradesIntegers) {
			if (list < 37) {
				numberIntegers.add(list);
			} else {
				originalValue = list;
				if (list % 5 == 0) {
					numberIntegers.add(list);
					System.out.println("Entro en el 1" + list);

				} else {
					list = list + 1;
					if (list % 5 == 0) {
						numberIntegers.add(list);
						System.out.println("Entro en el 2" + list);
					} else {
						list = list + 1;
						if (list % 5 == 0) {
							numberIntegers.add(list);
							System.out.println("Entro en el 3 " + list);
						} else {
							numberIntegers.add(originalValue);
						}
					}
				}
			}
		}
		for (Integer list : numberIntegers) {
			System.out.println(list);
		}
	}
}
