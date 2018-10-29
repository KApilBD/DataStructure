package linkedlistlocal;

import java.util.LinkedList;


/*
 * SD2x Homework #1
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the signature of any of the methods!
 */

public class LinkedListUtils {
	
	public static void insertSorted(LinkedList<Integer> list, int value) {

		if(list.peekFirst() == null) {
			System.out.println("List is Empty");
			return;
		}
		
		for(int i = 0; i< list.size();i++) {
//			System.out.println(list.get(i));
			if(list.get(i) == value || list.get(i)> value) {
				System.out.println(list.get(i));
				list.add(i, value);
				break;
			}			
		}
		if(list.peekLast() < value ) {
			list.add(list.indexOf(list.peekLast())+1,value);
		}

//		if (list.peekFirst() == null) {
//			System.out.println("List is Empty");
//			return;
//		}
//		for (int i = 0; i <= list.indexOf(list.getLast()); i++) {
//
//			if (value <= list.get(i)) {
//				list.add(i, value);
//				System.out.println("\n LinkedList Updated!!!");
//				break;
//			}
//			if (list.indexOf(list.getLast()) == i && list.getLast() < value) {
//				list.add(i + 1, value);
//				System.out.println("\n LinkedList Updated!!!");
//				break;
//			}
//		}

	}

	public static void removeMaximumValues(LinkedList<String> list, int N) {

		String compare =list.get(0);
		String sameValue = null;
		
		if (list.peekFirst() == null ||N<0){
			System.out.println("Linked List is empty or N's value is Negative");
			return;
		}
		
		for (int i = 0; i<N; i++){
			for(int j=1;j<=list.indexOf(list.getLast());j++){
//			System.out.println(j+" index val:"+list.get(j)  +" compare: "+ compare+ " diff: " + compare.compareTo(list.get(j)) +"\n");
				if(compare.compareTo(list.get(j))<0){
//					System.out.println( "\n Before Update "+compare);
					compare = list.get(j);
//					System.out.println(  "\n Updated "+compare);
				}else if(compare.compareTo(list.get(j))==0 ){
					
					sameValue=list.get(j);

				}
			}
			
			if(compare.equals(sameValue)){
//				System.out.println("\nDeleteing Same Value: "+compare);
				list.remove(sameValue);
				sameValue=null;
				compare = list.get(0);
				i--;
			}else
			{
//				System.out.println("\nDeleteing: "+compare);
				list.remove(compare);
				compare = list.get(0);
			}
			
//			System.out.println("Last value::::::"+compare);
		}

	}

	public static boolean containsSubsequence(LinkedList<Integer> one, LinkedList<Integer> two) {
		
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

		return (j == m); // this line is here only so this code will compile if you
						// don't modify it
	}
}
