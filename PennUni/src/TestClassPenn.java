import java.util.Arrays;
import java.util.LinkedList;

public class TestClassPenn {
	
	static LinkedList<Integer> l = new LinkedList<Integer>(Arrays.asList(3,5,8,9,14));
	

	public static void main(String[] args) {
		

		System.out.println(l);
		
		LinkedListUtils.insertSorted(l, 12);
		
		System.out.println(l);
		
		LinkedListUtils.insertSorted(l, 10);
		
		LinkedListUtils.insertSorted(l, 11);
		
		System.out.println(l);
		
		LinkedListUtils.insertSorted(l, 20);		
		System.out.println(l);
		
		LinkedListUtils.insertSorted(l, 25);
		
		System.out.println(l);
		
		
		
	}

}
