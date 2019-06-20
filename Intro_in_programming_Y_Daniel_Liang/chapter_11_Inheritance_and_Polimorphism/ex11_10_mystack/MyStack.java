package ex11_10_mystack;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class MyStack extends ArrayList<Object> {

	// Returns the top element in this stack without removing it.
	public Object peek() { 
        return get(size() - 1);
    }

	// Returns and removes the top element in this stack.
	public Object pop() {   
        Object o = get(size() - 1);
        remove(size() - 1);
        return o;
    }
	
	// Adds a new element to the top of this stack
    public void push(Object o) {
        add(o);
    }

  // Override the toString in the Object class 
    public String toString() {
        return "stack: " + super.toString();
    }
}