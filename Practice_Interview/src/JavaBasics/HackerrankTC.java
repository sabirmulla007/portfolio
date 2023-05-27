
package JavaBasics;

import java.io.*;

import java.util.*;

import java.util.stream.*;

import static java.util.stream.Collectors.toList;

class Result {
	static boolean flag;

	/*
	 * Complete the 'miniMaxSum' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */

	public static void miniMaxSum(List<Long> arr) {
		// Write your code here
		long minimum;
		long maximum;

		long A[] = new long[arr.size()];

		for (int i = 0; i < arr.size(); i++) {
			A[i] = arr.get(i);
		}
		long sum = 0;
		for (int i = 0; i < A.length; i++) {
			if ((A[i] >= 1 || Math.pow(10.0, 9.0) >= A[i])) {

				Result.flag = true;

			} else {
				Result.flag = false;

				break;
			}
		}

		int a = Result.returnMax(A);
		for (int i = 0; i < A.length; i++) {
			sum = sum + A[i];

		}

		minimum = sum - A[a];
		System.out.print(minimum + " ");

		sum = 0;
		int b = Result.returnMin(A);
		for (int i = 0; i < A.length; i++) {
			sum = sum + A[i];
		}

		maximum = sum - A[b];
		// System.out.println(maximum);
		System.out.println(maximum);
		maximum = sum - A[b];

	}

	public static int returnMax(long A[]) {
		int indexMax = 0;
		if (Result.flag) {

			long max;
			for (int i = 0; i < A.length; i++) {

				max = A[0];
				if (A[i] > max) {

					max = A[i];
					indexMax = i;
				}
			}

		}
		return indexMax;
	}

	public static int returnMin(long A[]) {
		int indexMin = 0;
		if (Result.flag) {

			long min;
			for (int i = 0; i < A.length; i++) {

				min = A[0];
				if (A[i] < min) {

					min = A[i];
					indexMin = i;
				}
			}

		}
		return indexMin;
	}

}

public class HackerrankTC {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Long::parseLong)
				.collect(toList());

		Result.miniMaxSum(arr);

		bufferedReader.close();
	}
}
