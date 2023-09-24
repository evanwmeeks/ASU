// Complete the implementation of your MyArrayList class in this file
import java.util.NoSuchElementException;

public class MyQueue implements IQueue {
	// add any necessary variables here
	private Node top; 
   private int size; 
	public MyQueue(){
	   top = null;
	   size = 0;
	}

	@Override
   public void enqueue(Object item) {
    Node newNode = new Node(item);
    if (top == null) {
        top = newNode; 
    } else {
        Node current = top;
        while (current.next != null) {
            current = current.next; 
        }
        current.next = newNode; 
    }
    size++;
}

	@Override
	public Object dequeue() {
    if (isEmpty()) {
        throw new NoSuchElementException();
    }
    Object item = top.data;
    top = top.next; 
    size--;
    return item;
}

	@Override
	public Object peek() {
	if (top == null) { throw new NoSuchElementException(); }
	return top.data;
	}

	@Override
	public int indexOf(Object item) {
	   int i = 0;
	   Node current = top;
	   while (current != null) {
	      if(current.data.equals(item)){
	         return i;
	      }
	      current = current.next;
	      i++;
	   }
	   return -1;
	}

	@Override
	public int size() {
   return size;
	}

	@Override
	public boolean isEmpty() {
	   return size == 0;
	}

// add any necessary methods or classes below
private class Node {
        Object data; 
        Node next;
        
        Node(Object data) {
            this.data = data;
            this.next = null;
        }
}
}
