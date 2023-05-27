package JavaBasics;

import java.util.ArrayList;
import java.util.List;

public class duplicateelementusingbubblesort {

	
	
	 public List<Integer> bubbleSort(int arr[]) {
		int n = arr.length;
		List<Integer> arr1=new ArrayList();
		for (int i = 0; i < n ; i++)
			for (int j = i+1; j <n; j++)
				if (arr[i] == arr[j]) {
					arr1.add(arr[j]);
				}
				
		return arr1;
	}

	void printArray(List arr1 ) {
		System.out.println(arr1);
	}

	public static void main(String args[]) {
		duplicateelementusingbubblesort bs = new duplicateelementusingbubblesort();
		int arr[] = { 64, 34,34, 25, 12, 22, 11, 90 };
		List<Integer> arr2=bs.bubbleSort(arr);
		System.out.println("Sorted array");
		bs.printArray(arr2);
	}
}