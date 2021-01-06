package listPerformance;

public class MyArrayList<E> implements List<E>{
	
	private Object[] arrayObj; 	// Create an array 
	private int length;         // Length of the array
	private int pointer;        // Points to the last element on list
	
	// Default Constructor
	public MyArrayList() {
		this.length = 10;
		this.pointer = 0;
		arrayObj = new Object[length];
	}
	
	// Parameter Constructor
	public MyArrayList(int length) { 
		this.length = length;
		this.pointer = 0;
		arrayObj = new Object[length];
	}
	
	// Getter & Setters for variables ... 
	
	public Boolean add(E e) {
		arrayObj[this.pointer+1] = e;
		return true;
	}   
	
	public void add(int index,E element) {
		arrayObj[index] = element;
	}
	
	// FIX THIS!!!
	public void clear() {
		for(int i = 0; i < pointer; i++) {
			arrayObj[i] = null;
		}
	}      
	
	// Remove element at the index
	public E remove(int index) {
		E removedElement = (E) arrayObj[index];
		int counter = 0;
		Object[] temp = new Object[10];
		
		for(int i = 0; i < 10; i++) { 
			if(i == index) { } // Skip ...
			
			else {
				temp[counter] = arrayObj[i];
				counter++;
			}
		}	
		
		arrayObj = temp;
		
		return removedElement;
	}     
	
	public Boolean remove(Object o) {
		return true;
	}      
	
	
	// Removes the first occurrence of the specified element from the list
	//public String toString() { }               // Returns a string representation of the list
	//public int size() { }                      // Returns the number of elements in the list

}
