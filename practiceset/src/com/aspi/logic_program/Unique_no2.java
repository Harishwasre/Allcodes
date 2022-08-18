package com.aspi.logic_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Unique_no2 {

	public static void main(String[] args) {

//		Integer[] numbers = {10, 11, 12, 11, 13, 24, 25};
//		Set<Integer> uniqKeys = new TreeSet<Integer>();
//		uniqKeys.addAll(Arrays.asList(numbers));
//		System.out.println("uniqKeys: " + uniqKeys);

//		}
		int[] numbers = {1, 1, 2, 1, 3, 4, 5};
		HashSet<Integer> setUniqueNumbers = new HashSet<Integer>();
		for(int x : numbers) {
			setUniqueNumbers.add(x);
			System.out.print(setUniqueNumbers);
			
		}
		for(Integer x : setUniqueNumbers) {
		    System.out.print(x+",");
		}
//		int[] numbers = { 1, 1, 2, 1, 3, 4, 5 };
		ArrayList<Integer> store = new ArrayList<Integer>(); // so the size can vary

		for (int n = 0; n < numbers.length; n++) {
			if (!store.contains(numbers[n])) { // if numbers[n] is not in store, then add it
				store.add(numbers[n]);
				System.out.print(store);
			}
		}
		    numbers = new int[store.size()];
		for (int n = 0; n < store.size(); n++) {
			System.out.println(numbers[n] = store.get(n));
		}

	}
}
