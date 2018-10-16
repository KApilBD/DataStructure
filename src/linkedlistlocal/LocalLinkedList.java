package linkedlistlocal;

public class LocalLinkedList {
	
	class Node {
		int value;
		Node next = null;
		Node(int value){
			this.value = value;
		}
	}
	protected Node head = null;
	protected Node tail = null;
	
	public void addElementFirst(int value) {
		
		Node addValue = new Node(value);
		if(head == null) {
			head = addValue;
			head.next = null;
			tail = head;
			System.out.println("Created List Given Element as Head");
		}
		else {
			Node temp = null;
			temp = addValue;
			temp.next = head;
			head = temp;
			System.out.println("Element Added at Head of list");
		}

	}
	public void addElementLast(int value) {
		Node addValue = new Node(value);
		Node current = head;
		if(current != null) {
		while(current.next != null) {
			current = current.next;
		}
		current.next = addValue;
		tail = current.next;
		tail.next = null;
		System.out.println("Element Added at Tail");
		}
		else {
			tail = addValue;
			tail.next = null;
			head = tail;
			System.out.println("Created List Given Element as Tail");
		}
	}
	public void printEle() {
		Node current = head;
		while(current.next != null) {
			current = current.next;
		System.out.println(current.value);}
		System.out.println(current.value);
	}
	

}
