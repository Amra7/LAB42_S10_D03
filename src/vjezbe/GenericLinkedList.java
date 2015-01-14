package vjezbe;

import java.util.Iterator;

/**
 * Class of Generic Linked List
 * 
 * @author amrapoprzanovic
 *
 * @param <T>
 *            String
 */
public class GenericLinkedList<T> implements Iterable<T>{

	private Node head;

	public GenericLinkedList() {
		this.head = null;
	}

	/**
	 * Adds new value - ' String' in linked list.
	 * @param value
	 */
	public void add(T value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	/**
	 * Removes element from linked list.
	 * 
	 * @param offset
	 *            - index of element in linked list.
	 */
	public void remove(int offset) {
		if (head == null) {
			return;
		}

		Node current = head;
		if (offset == 0) {
			head = current.next;
			return;
		}

		current = head.next;
		Node prev = head;
		int count = 1;
		while (count < offset) {
			prev = prev.next;
			current = current.next;
			count++;
		}
		prev.next = current.next;
		current = null;
	}

	/**
	 * Getter for Size of linked list.
	 * 
	 * @return size of linked list.
	 */
	public int getSize() {
		int size = 0;
		Node current = head;
		while (current != null) {
			current = current.next;
			size++;
		}
		return size;
	}



	/**
	 * Contains checks if liked list includes forwarded value.
	 * 
	 * @param value
	 *            - value ( String) that we forwarded.
	 * @return 'true' if it contains of 'false' if it does not contain.
	 */
	public boolean contains(T value) {
		if (head.value.equals(value)) {
			return true;
		} else {
			return contains(head, value);
		}
	}

	private boolean contains(Node current, T value) {
		if ( current == null){
			return false;
		}
		if (current.value.equals(value)) {
			return true;
		} else {
			return contains(current.next, value);
		}

	}
	

	@Override
	public Iterator<T> iterator(){
		return new Biterator<T>(head);
	}
	
	private class Biterator<T> implements Iterator<T>{
		private Node<T> current;

	
	public Biterator(Node start){
		current = start;
	}
	
	@Override
	public boolean hasNext(){
		return current != null;
	}
	
	@Override
	public T next(){
		T value =  current.value;
		current = current.next;
		
		return value;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
	}
	/**
	 * Converts all elements of linked list to String.
	 */
	public String toString() {
		String str = "";
		Node current = head;
		str += "[ ";
		while (current != null) {
			str += current.value;
			if (current.next != null) {
				str += ", ";
			}

			current = current.next;
		}
		str += " ]";

		return str;
	}

	/**
	 * Inner class Node
	 * 
	 * @author amrapoprzanovic
	 *
	 * @param <T>
	 *            String, Integer
	 */
	public class Node<T> {
		public T value;
		public Node next;

		public Node(T value) {
			this.value = value;
		}
	}

	

}
