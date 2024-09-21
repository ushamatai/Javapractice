package PracticePrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import LinkedList.NewLinkedList;

public class Iteratearrays {

	public static void main(String[] args) {
		
		ArrayList<String> list=  new ArrayList();
		
		list.add("Friends");
		list.add("Breaking Bad");
		list.add("Flights");
		list.add("Don");
		list.add("Jones");
		
		//Using Java 8 with for each loop and lambda expression
		System.out.println("-----Lamda----Using JAVA 8------");
		
		
		list.forEach(singleitem->{
			System.out.println(singleitem);		
					});
		
	
		//Using Iterator
		System.out.println("-----Using Iterator------");
		Iterator<String> it=list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		//Using Iterator and lambda
				System.out.println("-----Using Iterator and lamda------");
				Iterator<String> its=list.iterator();
				its.forEachRemaining(singleitem->{
					System.out.println(singleitem);
				});
				
				
				
				//Using for each loop
				System.out.println("-----Using for each loop------");
				for(String e: list) {
					System.out.println(e);
					
				}
				
				//Using for  loop
				System.out.println("-----Using for loop with order------");
				
				for(int i =0; i<list.size(); i++) {
					
					System.out.println(list.get(i));
				}
				
				
				//Using a listiterator() to traverse in both directions
				
				System.out.println("-----List iterator ------");
				
				
			ListIterator<String> singleitem = list.listIterator(list.size());
			while(singleitem.hasPrevious()) {
				System.out.println(singleitem.previous());
			}
				
		
		
		

	}

}
