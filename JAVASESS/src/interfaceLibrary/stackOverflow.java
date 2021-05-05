package interfaceLibrary;


		// TODO Auto-generated method stub
		
		
		public class stackOverflow { 
		    static int i = 0; 
		    public int c=10;
		    public static int printNumber(int x) 
		    { 
		    	 
		  
		        i = i + 2; 
		        System.out.println(i); 
		  
		        // Terminating condition 
		        if (i == 10) 
		            return i; 
		  
		        printNumber(i + 2); 
		        return i ;
		    } 
		  
		    public static void main(String[] args) 
		    { 
		        stackOverflow.printNumber(i); 
		        
		       
		    } 
		    
		

	}


