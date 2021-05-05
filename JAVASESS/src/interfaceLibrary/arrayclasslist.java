package interfaceLibrary;

import java.util.ArrayList;

public class arrayclasslist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array list declaration
		ArrayList<Integer> arc=new ArrayList<Integer>();
		
		arc.add(100);//0
		arc.add(200);//1
		System.out.println(arc.size());
		
		arc.add(300);//2
		
		arc.add(400);//3
		System.out.println(arc.size());
		
		arc.add(500);//4
		arc.add(600);//5
		
		ArrayList<Object> ob=new ArrayList<Object>();
		
		ob.add("Usha");
		ob.add('c');
		
		
		for(int i=0;i<arc.size();i++)
		{
			
			System.out.println(arc.get(i));
		}
		
		for(Object k: ob)
		{
		System.out.println(k);	
		}
		}
		
	
		
		
		//Static array declaration
//		Integer p[]= new Integer[5];
//		int x[]= new int[3];
//		Object obj[]=new Object[10];
		

	}


