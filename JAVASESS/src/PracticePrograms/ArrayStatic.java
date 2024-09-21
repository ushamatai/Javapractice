package PracticePrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayStatic {

	public static void main(String[] args) {
		

		//Static Int array
		//Size is fixed - to overcome we use dynamic arrays
		
		int a[]= new int[6];
		a[0]= 2;
		a[2]=9;
		a[4]=6;
		for(int f: a) {
			System.out.println(f);
			
		}
		
		
		
		//Array List
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(41);
		list.add(51);
		list.add(91);
		list.add(61);
		list.add(0, 1);
		list.add(list.size(), 101);
		
		//To update a specific value in array ,we use set method where you specify the index and then the value 
		//which needs to be updated
		list.set(1, 151);
		
		System.out.println(list.size());
		
		System.out.println("----------------");
		//System.out.println(list.get(2));
		
		//System.out.println(list.size());
		
		System.out.println("---------printing elements-------");
		
		for(int f: list) {
			System.out.println(f);
			
		}
		
		
		ArrayList<String> listString = new ArrayList<>();
		listString.add("pink");
		listString.add("yellow");
		listString.add("red");
		listString.add("green");
		listString.add("blue");
		

		System.out.println("---------printing elements of String  Array-------");
		
		for(String f: listString) {
			System.out.println(f);
			
		}
		//To swap 2 nos in Array
		//Swap method we mention the list name which we should swap along with the positions
		Collections.swap(listString, 0,1);
		
System.out.println("---------After Swapping -------");

//removeAll  And clear will remove elements from list
//So clear method will take each element into consideration and then mark element as null
//Remove all will return boolean value and will remove the elements in arrat
System.out.println(listString.removeAll(listString));
listString.clear();
System.out.println(listString);
		
		for(String f: listString) {
			System.out.println(f);
			
		}
//	To clone  list
		
		
		
		
		ArrayList<String> listString1 = new ArrayList<>();
		listString1.add("pink1");
		listString1.add("yellow1");
		listString1.add("red1");
		listString1.add("green1");
		listString1.add("blue1");
		ArrayList<String> clonedList= new ArrayList(listString1);
		
		System.out.println("---------Cloning -------");
		System.out.println(clonedList);
		
		
		
		
	}

}
