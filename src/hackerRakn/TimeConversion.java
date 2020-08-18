package hackerRakn;

import javax.sound.midi.Soundbank;

public class TimeConversion {
	/*
	 * Nombre del ejercico :TimeConversion
	 * 
	 * dificultad: EZ* objetivo: Trasformar la hora que esta en formato de 12 horas
	 * a 24..
	 */
	public static void main(String[] args) {
		String cadenaString = "08:00:39PM", flagString = "", isZeroString = "00";
		int ValueInInt = 0;

		if (cadenaString.endsWith("PM")) {

			cadenaString = cadenaString.replace("PM", "");

			flagString = cadenaString.substring(0, 2);

			ValueInInt = Integer.parseInt(flagString);

			if (ValueInInt != 12) {
				ValueInInt = ValueInInt + 12;
				cadenaString = cadenaString.replace(flagString, Integer.toString(ValueInInt));
			} else {
				cadenaString = cadenaString.replaceFirst(flagString, "12");
			}
		} else {
			flagString = cadenaString.substring(0, 2);
			System.out.println(flagString);
			if (flagString.equals("12")) {
				cadenaString = cadenaString.replace("AM", "");
				cadenaString = cadenaString.replace(flagString, isZeroString);

			} else {
				cadenaString = cadenaString.replace("AM", "");
			}
		}
		System.out.println(cadenaString);

	}
}
