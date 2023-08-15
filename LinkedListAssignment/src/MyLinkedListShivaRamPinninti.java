
public class MyLinkedListShivaRamPinninti <T> {
	private Node head;
	private Node tail;
	private int size;
	
	MyLinkedListShivaRamPinninti(){
		head = null;
		tail = null;
		size = 0;
	}
	
	private class Node{
		T data;
		Node link;
		Node(T element){
			data = element;
			link = null;
		}
	}

	
	public T getFirst() throws RuntimeException{
		// return the first element
		// if the list is empty, throw RuntimeException with a message
		// Write code here
	}
	public T getLast() throws RuntimeException{
		// return the last element
		// if the list is empty, throw RuntimeException with a message
		// Write code here
	}
	public void addLast(T newElement){
		// add a new Node to be the last element.
		// Write code here
	}
	public void removeLast(){
		// Case 1: if the list is empty --> do nothing
		// Case 2: if you have only one element --> remove it
		// Case 3: in the list has two or more elements(general case)
		// Caution: you must care about the [tail] after removal
		// Write code here
		
	}
	
	public int indexOf(T targetElement){
		// Returns the index of the first occurrence of the specified element(targetElement) in this list,
		// or -1 if this list does not contain the element.
		// Caution: index starts with 0 (the first element's index is 0)
		// Caution: to return index, you must check the index of node while you searching
		// Caution: When you compare two elements, please use 'equals' method instead of ==
		// Write code here
	}
		
	
	public int size() {
		return size;
	}
	public void removeFirst() throws RuntimeException {
		if(head == null) {
			throw new RuntimeException("in removeFirst(): no elements in the list");
		}
		else if(head == tail) { // size==1
			head = tail = null;
			size --;
		}
		else {
			head = head.link;
			size--;
		}
		
	}
	public void remove(int index) {
		if(index == 0) {
			removeFirst();
		}
		else if(head == tail) {
			head = tail = null;
			size--;
		} 
		else {
			Node cur = head;
			while (--index > 0) {
				cur = cur.link;
			}
			Node targetNode = cur.link;
			cur.link = targetNode.link;
			size--;
			if(cur.link == null)
				tail = cur;
		}
	}
	
	public void addFirst(T newElement){
		Node newNode = new Node(newElement);
		newNode.link = head;
		head = newNode;
		if(size==0) {
			tail = newNode;
		}
		size++;
	}
	
	public void add(int index, T newElement) {
		if(index == 0)
			addFirst(newElement);
		else {
			Node temp1 = head;
			while (--index > 0) {
				temp1 = temp1.link;
			}
			Node newNode = new Node(newElement);
			newNode.link = temp1.link;
			temp1.link = newNode;

			if (newNode.link == null) {
				tail = newNode;
			}
			size++;
		}
	}
	
	public String toString() {
		String str = "[";
		Node temp = head;
		
		while(temp != null) {
			str = str + temp.data;
			if(temp != tail) {
				str = str + ", ";
			}
			temp = temp.link;
		}		
		return str = str + "]";
	}
	
	public Iterator iterator(){
		// Write code here
		// create a new Iterator object and return it.
		return new Iterator();
	}
	
	// Complete the Iterator class
	class Iterator {
		Node nextNode; // to point [next node] Node object
		Node lastReturned; // to point [last returned] Node object
		Node prevNode; // to point the [previous of last returned] Node object
		Iterator(){
			// In this constructor, you must set nextNode, lastReturned, prevNode variables
			// next must be the first node of the list
			// lastReturned and prevNode must be null when the Iterator is created
			// Write code here
		}
		public T next() throws RuntimeException{
			// return the data_field of [next node]
			// caution: update nextNode, lastReturned, prevNode correctly
			// Throw an Exception if the iteration has no more elements
			// Write code here	
		}
		public boolean hasNext(){
			// return true when the [next node] exists
			// return false when we don't have the [next node]
			// Write code here
		}
		public void remove() {
			// Using prevNode and lastReturned, remove [last returned node] which is already read by next() method
			// If nothing read(by next() operation) yet, throw an Exception such as... throw new RuntimeException("Can't operate remove");
			// After remove(), you need to update lastReturned to prevent another remove() operation.  
			// Write code here
		}
	}	
	
}
