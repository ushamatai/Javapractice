package PracticePrograms;

public class swap2Strings {

	public static void main(String[] args) {
		
		 String  a = "Hello";
        String b = "World";
        
        
        
        //Concat both strings
        
        a= a+b;
       
        System.out.println(a);//HelloWorld
        System.out.println(a.length());
        System.out.println(b.length());
        

      b= a.substring(0, (a.length()-b.length()));
      System.out.println("Value of b is " + b);//Hello
      a= a.substring(b.length(), a.length());
      System.out.println("Value of a is " + a);
      
      
        
        
		

	}

}
