package JavaBasics;

import java.util.HashMap;
import java.util.Map;

public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 58, 14, 9, 63 }, { 12, 58, 9, 14 }, { 12, 14, 58, 9 } };
		int b[] = { 58, 14, 12, 9 };
		printCount(a, 3, 4, b, 4);

	}

	static void printCount(int a[][], int n, int m, int z[], int l) {
		for (int i = 0; i < n; i++) {
			Map<Integer, Integer> mp = new HashMap<>();
			for (int j = 0; j < m; j++)
				mp.put(a[i][j], 1);
			int count = 0;
			for (int j = 0; j < l; j++) {
				if (mp.containsKey(z[j]))
					count += 1;
			}
			System.out.println("row" + (i + 1) + " = " + count);
		}
	}

}
