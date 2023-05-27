package JavaBasics;

import java.io.*;

import java.lang.Math;

import java.util.*;

import java.util.stream.*;

import static java.util.stream.Collectors.toList;

class Result1 {
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

				Result1.flag = true;

			} else {
				Result1.flag = false;

			break;}
		}

		int a = Result1.returnMax(A);
		for (int i = 0; i < A.length; i++) {
			sum = sum + A[i];

		}

		minimum = sum - A[a];
		System.out.print(minimum + " ");

		sum = 0;
		int b = Result1.returnMin(A);
		for (int i = 0; i < A.length; i++) {
			sum = sum + A[i];
		}

		maximum = sum - A[b];

		System.out.print(maximum);
		maximum = sum - A[b];

	}

	public static int returnMax(long A[]) {
		int indexMax = 0;
		if (Result1.flag) {

			long max;
			max = A[0];
			for (int i = 0; i < A.length; i++) {

				
				if (A[i] > max) {

					max = A[i];

					ArrayList<Long> clist = new ArrayList<Long>();
					for (long a : A) {
						clist.add(a);

					}
					indexMax = clist.indexOf(max);
				}
			}

		}
		return indexMax;
	}

	public static int returnMin(long A[]) {
		int indexMin = 0;
		if (Result1.flag) {

			long min;min = A[0];
			for (int i = 0; i < A.length; i++) {

				
				if (A[i] < min) {

					min = A[i];
					ArrayList<Long> clist = new ArrayList<Long>();
					for (long a : A) {
						clist.add(a);

					}
					indexMin = clist.indexOf(min);
				}

			}

		}
		return indexMin;
	}
}

public class minSUMmaxSUM {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Long::parseLong)
				.collect(toList());

		Result1.miniMaxSum(arr);

		bufferedReader.close();
	}
}
