import java.util.Arrays;
import java.util.LinkedList;

public class TestClassPennStr {

	static LinkedList<String> l = new LinkedList<String>(Arrays.asList("in", "amit","kapil","baraskar","kapis", "haskar"));

	public static void main(String[] args) {

		System.out.println(l);

		LinkedListUtils.removeMaximumValues(l, 3);
		
		System.out.println(l);
	}

}
