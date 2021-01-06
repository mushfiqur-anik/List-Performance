package listPerformance;

public class MyArrayList<E> implements List<E>{
	
	private Object[] arrayObj; 	// Create an array 
	private int length;         // Length of the array
	private int pointer;        // Points to the next available slot to add element
	
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
		arrayObj[this.pointer] = e;
		return true;
	}   
	
	public void add(int index,E element) {
		arrayObj[index] = element;
	}
	
	public void clear() {
		for(int i = 0; i < pointer; i++) {
			arrayObj[i] = null;
		}
	}      
	
	public E remove(int index) {
		E removedElement = (E) arrayObj[index];
		
		// Check if out of index
		if(index >= 0 && index < pointer) {
			
			
			
		}
		
		else { 
			System.out.println("Index not found in the list");
		}
		
		
		
		
		// Shift the array
		
		
		
		return removedElement;
	}     
	
	
	// Removes the element at the specified position of the list
	public Boolean remove(Object o) { }       // Removes the first occurrence of the specified element from the list
	public String toString() { }               // Returns a string representation of the list
	public int size() { }                      // Returns the number of elements in the list

}
