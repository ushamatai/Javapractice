package Interviewpractice;

public class ReversenoUsingRecursion {
	static  int   num =234;
	  static  int  revnum=0, r;

	public static void main(String[] args) {

    System.out.println( revNum(num));
    
    String s= "@@@@@@@@@@ testing ASDSF @@@@";
    s=s.replaceAll("[^a-zA-Z0-9]", "");
    System.out.println(s);
    

	}
	
	
//static public void fibonacci(int count) {
//		
//		if(count>0)
//		{
//			int n3= n1+n2;
//			System.out.print(", "+ n3);
//			n1=n2;
//			n2=n3;
//			fibonacci(count-1);
//			
//		}
//		
//	}
	
	public static int revNum(int num)
	{
	if(num>0)
    {
   	 
   	 r= num%10;
   	 revnum= revnum *10+ r;
   	 num= num/10;
    revNum(num);
   	 
   	 
    }
	
	return revnum;
	
	}

}
