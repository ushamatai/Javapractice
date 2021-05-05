package interfaceLibrary;

import java.util.ArrayList;
import java.util.ListIterator;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class arrayassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java program to create a new array list, add some colors (string) and print out the collection
		
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Red");
		colors.add("blue");
		colors.add("Green");
		colors.add("Orange");
		
		for(String x: colors)
		{
			System.out.println(x);
		}
		
		System.out.println("--------------------");
		
		//Write a Java program to insert an element into the array list at the first and last positions.
		ArrayList<Integer> addn=new ArrayList<Integer>(5);
		addn.add(42);
		addn.add(45);
		addn.add(83);
		
		
		
		addn.add(0,100);
		addn.add(4, 200);
		
	//System.out.println(addn.size());
	
	for(Integer x:addn)
	{
		System.out.println(x);
	}
	
	System.out.println("-----------------------------");
	
	//Write a Java program to retrieve an element (at a specified index) from a given array list.
	
	
	ArrayList<String> st= new ArrayList();
	st.add("America");
	st.add("India");
	st.add("Africa");
	System.out.println(st.get(1));
	
	
	//Write a Java program to update specific array element by given element.
	
	st.set(2, "Antarctica");
	
	for(String x: st)
	{
		System.out.println(x);
	}
	
	System.out.println("-----------------------------");
	
	//Write a Java program to remove the third element from a array list. 
	st.remove(2);
	for(String x: st)
	{
		System.out.println(x);
	}
	
	System.out.println("-----------------------------");
	
	//Write a Java program to search an element in a array list.
	String mt= "China";
	
	switch (mt) {
	case "India":
		System.out.println("India found");
		break;
		default:
		System.out.println("Incorrect");
		break;
	}
	
	
	if(st.contains("India"))
	{
		System.out.println("Element Found");
	}
	else
	{
		System.out.println("Not Found");
	}
	
	
	System.out.println("-----------------------------");
	
	//Write a Java program to reverse elements in a array list
	st.add("Australia");
	st.add("Denmark");
	System.out.println(st.size());
	ArrayList<String> pn= new ArrayList<String>();
	for(int i=st.size()-1;i>=0;i--)
	{
	pn.add(st.get(i));
	
	

	}
	
	for(String v: pn)
	{
		System.out.println(v);
	}
	
	System.err.println("----------------------------------");
	
	//Write a Java program to extract a portion of a array list.
	
	ArrayList<String>mn= new ArrayList<String>(pn.subList(1, 3));
	
	for (String mncx:mn)
	{
		System.out.println(mncx);
	}
	
	
	System.out.println("---------------------------------------");
	
	
	
	ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
    list.add("Ravi");//Adding object in arraylist  
    list.add("Vijay");  
    list.add("Ravi");  
    list.add("Ajay");  
     
    System.out.println("Traversing list through List Iterator:");  
    //Here, element iterates in reverse order  
       ListIterator<String> list1=list.listIterator(list.size()); 
       
       System.out.println(list.get(3));
       while(list1.hasPrevious())  
       {  
           String str=list1.previous();  
           System.out.println(str);  
       }  
	
	
	
	
	
	
	
	
	}
	
	
	

}
