import java.util.NoSuchElementException;

public class MyStack implements IStack {
	// add any necessary variables here
	 private Node top; 
    private int size; 
	public MyStack(){
	   top = null;
	   size = 0;
	}
	

	@Override
	public void push(Object item) {
	  Node newNode = new Node(item);
     newNode.next = top;
     top = newNode;
     size++;
	}

	@Override
	public Object pop() {
	  if (top == null) { throw new NoSuchElementException(); }
      Object element = top.data;
      top = top.next;
      size--;
      return element;
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
        Object data; // data in the node
        Node next; // reference to the next node
        
        Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }
}
