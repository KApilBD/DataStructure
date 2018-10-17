package linkedlistlocal;

import java.util.LinkedList;


public class LabTest {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(22); 
		list.add(34);
		list.add(34); 
		list.add(40);  
		list.add(56);
		list.add(70);
		
		System.out.println(list);
//		System.out.println(list.get(0));
		LinkedListUtils.insertSorted(list, 66);
		System.out.println(list);
	}

}
