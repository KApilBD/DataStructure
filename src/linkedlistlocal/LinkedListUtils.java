package linkedlistlocal;

import java.util.LinkedList;

/*
 * SD2x Homework #1
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the signature of any of the methods!
 */

public class LinkedListUtils {

	public static void insertSorted(LinkedList<Integer> list, int value) {

		/* IMPLEMENT THIS METHOD! */

		for (int i = 0; i < list.size(); i++) {
			// System.out.println(list.get(i));
			if (list.get(i) == value || list.get(i) > value) {
				System.out.println(list.get(i));
				list.add(i, value);
				break;
			}

		}

	}

	public static void removeMaximumValues(LinkedList<String> list, int N) {

		/* IMPLEMENT THIS METHOD! */

	}

	public static boolean containsSubsequence(LinkedList<Integer> one, LinkedList<Integer> two) {

		/* IMPLEMENT THIS METHOD! */
		if (one.peekFirst() == null || two.peekFirst() == null) {
			System.out.println("Linked List is empty...");
			return false;
		}
		
		int j = 0;
		int m = two.indexOf(two.getLast())+1;
		int n = one.indexOf(one.getLast())+1;
		System.out.println("m: "+ m + " n: "+n);
		for (int i = 0; i < n && j < m; i++) {

			System.out.println("element frm one: " + one.get(i) + " element frm two: " + two.get(j));
			if (one.get(i) == two.get(j)) {
				j++;
				System.out.println(j);
			}
			else if(one.get(i) != two.get(j) && j!=m) {
				j=0;
			}
		}

		return (j == m);

		// return true; // this line is here only so this code will compile if you don't
		// modify it
	}
}
