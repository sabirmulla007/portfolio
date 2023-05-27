
package JavaBasics;

import java.io.*;
import java.util.*;

class primeNo {
	public void checkPrime(int... nums) {
		StringBuilder result = new StringBuilder();

		for (int num : nums)
			if (isPrime(num))
				result.append(num).append(" ");

		System.out.println(result.toString().trim());
	}

	private static boolean isPrime(int num, int... i) {
		if (num == 2)
			return true;
		if (num < 2 || num % 2 == 0)
			return false;
		if (i.length == 0) {
			i = new int[1];
			i[0] = 2;
		}
		if (i[0] * i[0] > num)
			return true;
		if (num % i[0] == 0)
			return false;
		return isPrime(num, i[0] + 1);
	}
}