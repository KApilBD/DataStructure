import java.util.Arrays;
import java.util.LinkedList;

public class TestClassPennCombine {

	static LinkedList<Integer> one = new LinkedList<Integer>(Arrays.asList(1,2,3,5,8,9,14,16));
	static LinkedList<Integer> two = new LinkedList<Integer>(Arrays.asList(3,5,8,9,14));
	
	public static void main(String[] args) {
		
		System.out.println(one);
		System.out.println("----------------------------");
		System.out.println(two);
		
		System.out.println(LinkedListUtils.containsSubsequence(one, two));
		
		
		

	}

}
