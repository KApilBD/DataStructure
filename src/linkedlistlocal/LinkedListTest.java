package linkedlistlocal;

public class LinkedListTest {

	public static void main(String[] args) {
		LocalLinkedList list1 = new LocalLinkedList();
		
		list1.addElementFirst(10);
		list1.addElementFirst(20);
		list1.addElementFirst(30);
//		list1.addElementLast(50);
		
		list1.printEle();
	}

}
