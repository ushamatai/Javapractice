package LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareHashMaps {

	public static void main(String[] args) {

       HashMap<Integer, String> map1= new HashMap<>();
       map1.put(1, "Agent");
       map1.put(2, "India");
       map1.put(3, "Detective");
       
       HashMap<Integer, String> map2= new HashMap<>();
       map2.put(1, "Agent");
       map2.put(2, "India");
       map2.put(3, "Detective");
      map2.put(4, "Detective");
       
       
       
       HashMap<Integer, String> map3= new HashMap<>();
       
       map3.put(1, "Agent");
       map3.put(2, "India");
       map3.put(3, "Louisiona");
       map3.put(4, "Detective");
       
       //1:  On the basis of key value pair : use .equals method
       System.out.println(map1.equals(map2));//print false
       System.out.println(map1.equals(map3));//
       
       
       //2. On the basis of  only key value : use keyset
       //Since set does not store  duplicate value, hence it will take only unique value set, hence even if keys are repeating
       //it will take only unique values
      System.out.println( map1.keySet().equals(map2.keySet()));
      System.out.println(map1.keySet().equals(map3.keySet())) ;
      
      //3.Find the difference key
      //create the hashset
      HashSet<Integer> hash= new HashSet<>(map1.keySet());
      System.out.println("After adding map1 (1,2,3)   :" +  hash);
      hash.addAll(map2.keySet());
      System.out.println("After adding map2 1,2,3,4 :   " +hash);
      
      hash.removeAll(map1.keySet());//Existing-map1(what is specified in parameters)
      System.out.println(hash);
      
      
      //4.Compare maps by value: use arraylist to verify duplicates
      //as arraylist can allow duplicates
      System.out.println(new ArrayList<String>(map2.values()).equals(new ArrayList<> (map3.values())));
      System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<> (map2.values())));
      
      //In case of hashset-Duplicates are not allowed
      System.out.println(new HashSet<>(map2.values()).equals(map3.values()));
       
       
       
       
		
		
		
		

	}

}
