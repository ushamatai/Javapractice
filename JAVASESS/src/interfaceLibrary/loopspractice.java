package interfaceLibrary;

public class loopspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=1;
		int p=1;
		int even=0;
		//printing nos from for loop--for loop
		for(int i=1; i<=10;)
		{
			System.out.println(i);
			i++;
		}
		
		
		System.out.println("-------------------------------");
		
		
		
		//while loop
		while(k<=10) {
			
			System.out.println(k);
			k++;
		}
		
		System.out.println("-------------------------------");
			
		
		//do while loop
		do
		{
			System.out.println(p);
			p++;
		}while(p<=10);

		System.out.println("-------------------------------");
		//print even nos
		
		while(even<=10)
		{
			System.out.println(even);
			even=even +2;
		}
		System.out.println("-------------------------------");
		//print odd nos
		
		for (int odd=1; odd<=10;odd=odd+2)
			
		{
			System.out.println(odd);
			
		}
		
		//print alphabet between a to z
		
		for (char c='a'; c<='z'; c++)
			
		{
			System.out.println(c);
		}
		
		
		//
		
	for(String st="hello" ; st.equals("hello");)
			
		{
			System.out.println(st);
			break;
			
		}
	}
	
	

}
