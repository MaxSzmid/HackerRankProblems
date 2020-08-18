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

class Result {

	/*
	 * Complete the 'diagonalDifference' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * 2D_INTEGER_ARRAY arr as parameter.
	 */

	public static int diagonalDifference(List<List<Integer>> arr) {
		int mainDiagonal = 0, oppositeDiagonal = 0;
		/*For the first diagonal, the values always are in pairs. such as 0;0, 1;1 , 2;2, ...*/
		for (int i = 0; i < arr.size(); i++) {
			for (int in = 0; in < arr.size(); in++) {
				if (i == in) {
					mainDiagonal += arr.get(i).get(in);
				}
			}

		}
		
		/*for the secont diagonal, the values have other pattern,
		 *  like this 0;N,  1;N-1 , 2;N-2, 3;N-3, ... where "N" is equal to the max lentgh of the array list.
		 *  
		 *  
		 * indice1 and indice2 are the index of the matriz, indice1 start in 0 and
		 * indice2 start in the max length of the array "N".
		 */
		int lastPositionAtRight = arr.size() - 1, indice1 = 0, indice2 = 0;
		indice2 = lastPositionAtRight;
		for (int i = 0; i < arr.size(); i++) {
			oppositeDiagonal += arr.get(indice1).get(indice2);
			indice1++;
			indice2--;
		}
		return Math.abs(mainDiagonal - oppositeDiagonal);
	}

}

public class DiagonalDiference {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, n).forEach(i -> {
			try {
				arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		int result = Result.diagonalDifference(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
