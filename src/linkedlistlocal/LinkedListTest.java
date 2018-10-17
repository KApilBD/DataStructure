package linkedlistlocal;

public class LinkedListTest {

	public static void main(String[] args) {
		LocalLinkedList list1 = new LocalLinkedList();
		
		list1.addElementLast(50);
		  list1.addElementFirst(20);
		  list1.addElementFirst(30);
		  list1.addElementLast(50);
		  list1.addElementLast(80);
		  list1.addElementFirst(10);


		        list1.addElementOnIndex(4,90);
		        // list1.addElementOnIndex(0,40);
		        // list1.addElementOnIndex(6,60);
		  
		  list1.printEle();
	}

}
