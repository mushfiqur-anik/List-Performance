// Created By: Mushfiqur Anik
// Project Name: List Performance
// Project Description: Compares the performance of several operations between the custom 
//                      ArrayList and LinkedList class

package listPerformance;

public interface List <E> {

	public Boolean add(E e);               // Adds specified element at the end of the list
	public void add(int index,E element);  // Adds specified element at the specified position of the list
	public void clear();                   // Removes all the elements from the list
	public E remove(int index);            // Removes the element at the specified position of the list
	public Boolean remove(Object o);       // Removes the first occurrence of the specified element from the list
	public String toString();              // Returns a string representation of the list
	public int size();                     // Returns the number of elements in the list
		
}
