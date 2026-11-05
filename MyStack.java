package MyStack;

import java.util.EmptyStackException;

public class MyStack implements Cloneable {
    private int[] elements;
    private int size;

    public MyStack() {
        this.elements = new int[0];
        this.size = 0;
    }
    
    

    public MyStack(int capacity, int size) {
		
		this.elements = new int[capacity];
		this.size = size;
	}
    
    
    
	public int[] getElements() {
		return elements;
	}



	public void setElements(int[] elements) {
		this.elements = elements;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public MyStack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException();
        }
        this.elements = new int[initialCapacity];
        this.size = 0;
    }

    public void push(int item) {
        ensureCapacity();
        elements[size++] = item;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[--size];
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            int newSize = elements.length * 2;
            int[] newElements = new int[newSize];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

   


	
		@Override
		public Object clone() {
		    try {
		        
		        MyStack clonedStack = (MyStack) super.clone();
		        
		      
		        clonedStack.elements = this.elements.clone();
		        
		        return clonedStack;
		        
		    } catch (CloneNotSupportedException e) {
		       
		        throw new RuntimeException(e);
		    }
		}

	}
    


	

	

