package com.collectionsassignment.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchornizingArrayList {

	public static void main(String args[]) {
		/*Using Collections.synchronizedList*/
		
		List<String> list=Collections.synchronizedList(new ArrayList<String>());
		list.add("Shilp");
		list.add("Isha");
		list.add("harsh");
			
		synchronized(list)
		{
			   Iterator it = list.iterator();
			   
	            while (it.hasNext()) {
	            	// list.add("aditya");
	            	System.out.println(it.next());
	            }
	                
		}
		
		
		/*CopyOnWriteArrayList */
		/*all mutative operations such as add delete are implemented by creating a seperate
		 * copy of an underlying array */

		CopyOnWriteArrayList<Integer> threadSafe=new CopyOnWriteArrayList<>();
		 threadSafe.add(1);
		 threadSafe.add(2);
		 threadSafe.add(3);
		 
		 Iterator<Integer> it=threadSafe.iterator();
		 while (it.hasNext()) {
			 	threadSafe.add(4); // this does not throw any exception as the thread is working on some other copy of the collection
	            System.out.println(it.next());
		 }
		 
		 
		 
		 /*Concurrent modification example*/
		 /*when you are trying to mutate a collection by one thread while other thread is iterating
		  * over the same collection this exception is thrown by the iterator
		  */
		 
		 List<String> names=new ArrayList<>();
		 names.add("Hello");
		 names.add("Bello");
		 
		 Iterator<String> itr=names.iterator();
		 
		 while(itr.hasNext()) {
			 names.add("Hii"); //you cannot mutate the collection while other thread is iterating
			 System.out.println(itr.next());
		 }
	}
}
