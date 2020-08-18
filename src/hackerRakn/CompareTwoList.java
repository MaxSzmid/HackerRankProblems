package hackerRakn;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTwoList {

	// Complete the compareTriplets function below.
	// TU ALGORITMO DE RESPUESTA AL SIGUIENTE REQUISITO
	/*
	 * Debe devolver una serie de dos enteros, el primero es el puntaje de Alice y
	 * el segundo el de Bob.
	 * 
	 * compareTriplets tiene los siguientes parámetros:
	 * 
	 * a : una serie de enteros que representan la calificación de desafío de Alice
	 * b : una serie de enteros que representan la calificación de desafío de Bob
	 * 
	 * Formato de salida
	 * 
	 * Devuelve una matriz de dos enteros que denotan los puntos de comparación
	 * respectivos obtenidos por Alice y Bob.
	 * 
	 * If a[indice] > b[indice] , then Alice is awarded point.
	 * If a[indice] < b[indice] , then Bob is awarded point. 
	 * If a[indice] == b[indice], then neither person receives a point.
	 */
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		int pointOfAlice = 0, pointOfBobs = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {
				pointOfAlice++;
			} else if (a.get(i) < b.get(i)) {
				pointOfBobs++;
			}
		}
		List<Integer> result = new ArrayList<Integer>(Arrays.asList(pointOfAlice, pointOfBobs));
		return (result);

	}

	// algoritmo escrito por HackerRank
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		List<Integer> result = compareTriplets(a, b);

		bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" ")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}
}
