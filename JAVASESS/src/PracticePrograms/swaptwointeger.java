package PracticePrograms;

import java.util.ArrayList;
import java.util.List;

public class swaptwointeger {

	public static void main(String[] args) {
		
		int x= 7;
		int y=6;
		//int elements[]= 
		List<Integer> element = new ArrayList<Integer>();
		
		
		//By using 3rd variable
		
//		int temp;
//		temp=x;
//		x=y;
//		y=temp;
//		
		System.out.println("Swapped x is now::  " + x +"\n"+"Swapped y is now::  " + y);
		
		System.out.println("-----Wihout using 3rd variable------");
		
		 x= x+y;//13	
		 y=x-y;//13-6= 7
		 x=x-y;//13-7 =6
		
		 
		 System.out.println("Swapped x is now::  " + x +"\n"+"Swapped y is now::  " + y);
		 
		 System.out.println("------------------------------------");
		 element.add(3);
		 element.add(4);
		 element.add(6);
		 System.out.println(element);
	 for(int i=0; i<element.size();i++) {
		 if(element.get(i).equals(4)) {
			 element.remove(i);
		 }
		 
	 }
	 System.out.println(element);
		
		
		

	}

}
