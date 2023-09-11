import java.util.NoSuchElementException;

public class MyArrayList implements MyList{

private int capacity = 8; 
private int size = 0;
private Object[] storage = new Object[capacity];


public void makeCapacity(int minCapacity)
{
	if(minCapacity > capacity)
	{
		Object[] newArray = minCapacity > 8 ? new Object[minCapacity] : new Object[8];
		
		for(int i = 0; i <size; i++)
		{
			newArray[i] = storage[i];
		}

		storage = newArray;
		capacity = newArray.length;
	}

}


public void trimExcess()
{
	makeCapacity(size);
}

@Override
public void addToEnd(Object element)
{
	if(size == capacity) {
			makeCapacity(2*capacity); 
		}
		
		storage[size] = element;  
		size++;  
}

@Override
public void insertAt(int index, Object element)
{
	if (index >=0 && index <= size)
	{
		if(size ==capacity)
		{
			makeCapacity(2*capacity);
		}

		int i = size;
		while(i>index) {
			storage[i] = storage[i-1];
			i--;

		}

		storage[index] = element;
		size++;
	}

	else 
	{
		throw new NoSuchElementException("Error: Index out of bounds.");
	}
}

@Override
public void removeAt(int index)
{
	if(index >=0 && index < size)
	{
		int i = index;
		while (i < (size-1)) 
		{
			storage[i] = storage[i+1];
			i++;
		}
		size --;

	}
	else 
	{
		throw new NoSuchElementException("Error: Index out of bounds.");
	}

}

@Override
public Object getAt(int index)
{
	if(index >= 0 && index < size)
	{
		return storage[index];
	}
	
	else
	{
		throw new NoSuchElementException("Error: Index out of bounds.");
}
}

@Override
public int getSize()
{
	return size;
}
  
    // Do not alter the code below 
    @Override
    public MyListIterator getIterator() {
        return new MyArrayListIterator();
    }
    
    private class MyArrayListIterator implements MyListIterator {
        int currentIndex = -1;

        @Override
        public Object next() {
            ++currentIndex;
            return storage[currentIndex];
        }

        @Override
        public boolean hasNext() {
            return currentIndex < size - 1;
        }
    }   
}