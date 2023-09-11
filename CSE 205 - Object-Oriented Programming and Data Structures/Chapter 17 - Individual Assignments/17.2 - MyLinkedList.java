import java.util.NoSuchElementException;

public class MyLinkedList implements MyList {
    private Node head = null;
    private int size = 0;

    @Override
    public void addToEnd(Object element) {
        insertAt(size, element);
    }

    @Override
    public void insertAt(int index, Object element) {
        if (index >= 0 && index <= size) {
            Node addition = new Node();
            addition.data = element;
            addition.next = null;
            Node curr = head, prev = null;
            int pos = 0;

            while (pos < index) {
                prev = curr;
                curr = curr.next;
                pos++;
            }

            if (prev == null) {
                addition.next = head;
                head = addition;
            } else {
                prev.next = addition;
                addition.next = curr;
            }
            size++;
        } else {
            throw new NoSuchElementException("Error: Index out of bounds.");
        }
    }

    @Override
    public void removeAt(int index) {
        if (index >= 0 && index < size) {
            Node curr = head, prev = null;
            int pos = 0;

            while (pos < index) {
                prev = curr;
                curr = curr.next;
                pos++;
            }

            if (prev == null) {
                head = head.next;
            } else {
                prev.next = curr.next;
            }
            size--;
        } else {
            throw new NoSuchElementException("Error: Index out of bounds.");
        }
    }

    @Override
    public Object getAt(int index) {
        if (index >= 0 && index < size) {
            int pos = 0;
            Node curr = head;

            while (pos < index) {
                curr = curr.next;
                pos++;
            }
            return curr.data;
        } else {
            throw new NoSuchElementException("Error: Index out of bounds.");
        }
    }

    @Override
    public int getSize() {
        return size;
    }



   
	// Do not alter the code below 
	
	public MyListIterator getIterator() {
		return new MyLinkedListIterator();
	}
	
	private class MyLinkedListIterator implements MyListIterator {
		Node currentNode = null;

		@Override
		public Object next() {
			if (currentNode != null)
				currentNode = currentNode.next;
			else
				currentNode = head;

			return currentNode.data;
		}

		@Override
		public boolean hasNext() {
			if (currentNode != null)
				return currentNode.next != null;
			else
				return head != null;
		}
	}
	
	class Node {
		public Object data = null;
		public Node next = null;
	}
}