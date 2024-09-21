package StringPrograms;

public class PrintEvenLengthwordstring {

	public static void main(String[] args) {
		
       String str  = "I am the boss of the world";
       String srArray[]=str.split(" ");
       
       for(String e : srArray) {
    	   //System.out.println("----Orig string------"+e);
    	   
    	   int len= e.length();
    	   
    	   if (len %2 == 0) {
   		   System.out.println(e);
			
		}
    	   
       }		

	}

}
