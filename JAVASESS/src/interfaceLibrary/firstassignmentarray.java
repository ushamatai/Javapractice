package interfaceLibrary;

public class firstassignmentarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To print batman
		int n=1;
		
		while(n<6)
		{
			System.out.println("I am Batman");
			System.out.println("\n");
			n++;
		}
		
		System.out.println("-------------------------");
		
		//to print batman with nos
		
		for(int p=1 ; p<6; p++)
		{
			System.out.println("I am Batman" +" " + p);
			
			
		}
		
		System.out.println("-------------------------");
		
		//to print nos from 10 to 1
		//For loop
		
		for(int p=10;p>=1; p--)
		{
			System.out.println(p);
		}

		System.out.println("---------While loop----------------");
		int k=10;
		while(k>=1)
		{
			System.out.println("Hello World");
			k--;
		}
		
		
		while(k>=1)
		{
			System.out.println(k);
			k--;
		}
		
		System.out.println("---------Do While loop----------------");
		
		int m= 10;
		do 
		{
			System.out.println(m);
			m--;
		}while(m>=1);
		
		//
		//To print nos between 1 to 10 and break if 7 is there
		
		System.out.println("---------print nos----------------");
		
		for(int i=1;i<=20;i++)
		{
			
			if (i%7==0)
			{
				break;
			}
			
			else
			{
				System.out.println(i);
			}
		}
			
			
			
			
System.out.println("-----------------Array Assignment--------------------------");
//			
////			
			//int ob[][]=new int[4][10];
              //int ob[]=new int[4];

			for(int i=0;i<4;i++)
			{
				
				for(int j=0;j<10;j++)
				{
			
				System.out.print(i);
				System.out.print(j + " ");
				
				}
				System.out.print("\n");
	}
		
			System.out.println("-----------------Array Assignment  2--------------------------");
			
			
			
			Object Player1[]= new Object[5];
			 Player1[0]="Sachin";
			 Player1[1]= "42";
			 Player1[2]="F";
			 Player1[3]="Team 2";
			 Player1[4]="45";
			 
			 Object Player2[]= new Object[5];
			 
			 Player2[0]="Virat";
			 Player2[1]= "45";
			 Player2[2]="M";
			 Player2[3]="Team 3";
			 Player2[4]="95";
			 
             Object Player3[]= new Object[5];
			 
			 Player3[0]="Rahul";
			 Player3[1]= "49";
			 Player3[2]="M";
			 Player3[3]="Team 4";
			 Player3[4]="195";
			 
			 
			 
			 for (Object p:Player1)
			 {
				 System.out.println(p);
			 }
			 
			 System.out.println("--------------------");
			
			 
			 for (Object p:Player2)
			 {
				 System.out.println(p);
			 }
			 System.out.println("--------------------");
			 
			 for (Object p:Player3)
			 {
				 System.out.println(p);
			 }
			 System.out.println("--------------------");
			 
			 
			 
			for (int z =4; z>=0; z--)
			{
				
				System.out.println( "n = " + z);
				
			}
			                       
			
			
			
			
			
		
		
		
		
		
	}
}


