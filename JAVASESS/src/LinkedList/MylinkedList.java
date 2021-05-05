package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MylinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> ll= new LinkedList<String>();
		//Adding all the elements
		ll.add("Doctor");
		ll.add(1, "India");
		ll.add(null);
		LinkedList<String> ll1= new LinkedList<String>();
		ll1.add("USA");
		ll1.add("Duke");
		ll1.addFirst("Neha");
		ll1.addLast("Shalu");
		ll.addAll(1, ll1);
		//ll.addAll(ll1);
		System.out.println(ll);
		System.out.println("**********************");
		System.out.println(ll1.getFirst());
		System.out.println(ll1.get(3));
		ll.set(3, "Turkey");
		System.out.println(ll);
		
		//Remove
		
		ll.remove();
		System.out.println("After remove:   " + ll);
		ll.removeAll(ll);
		System.out.println("After remove all:   " + ll);
		ll.addAll(0, ll1);
		System.out.println("After remove all:   " + ll);
		ll.removeFirstOccurrence("Shalu");
		System.out.println("After remove all:   " + ll);
		System.out.println("using for loop");
		
		//using for loop
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("---------------------------------");
		
		//using for each loop
		System.out.println("Using advance for loop");
		
		for(String n: ll) {
			
			System.out.println(n);
		}
		
		System.out.println("---------------------------------");
		
		//using  iterator loop
		System.out.println("Using iterator");
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
			
		}
		
		System.out.println("---------------------------------");
		
		//While loop
		System.out.println("Using while loop");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
			}
		
		System.out.println("---------------------------------");
		
		//using list
		ListIterator<String> str=ll.listIterator(1);
		while(str.hasNext()) {
			
			System.out.println(str.next());
		}
		
		
		
		
		
		
		
		
		

	}

}
