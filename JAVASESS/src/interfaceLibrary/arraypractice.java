package interfaceLibrary;

public class arraypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
     	int i[]=new int[4];
//	   for(int j =0; j<=3;j++)
//	   {
//		   
//		   i[j]=j;
//		   System.out.println(i[j]);
//	   }
     	
     	i[0]=5;
     	i[1]=10;
     	i[2]=15;
     	i[3]=20;
     	//i[4]=10;//Run time error
	   
	   
	   System.out.println("--------------");
	   
	   System.out.println(i.length);
	   System.out.println(i.length-1);
	   
	   System.out.println("--------------");
	   
	   //for loop to print values
	   for(int p=0; p<i.length;p++)
	   {
		   
		   System.out.println(i[p]);
	   }
	   
	   System.out.println("--------------");
	   
	   //for each loop
	   for(Integer k :i)
	   {
		   
		   
		   System.out.println(k);
		   
		  
	   }
	   
	   
	   // String Array
	   
	   String student[]=new String[3];
	   
	   student[0] ="Hello";
	   student[1]="World";
	   student[2]="People";
	   
	   for(int h=0;h<student.length;h++)
	   {
		   System.out.println(student[h]);
	   }
	   
	   //Object array
	   
	   Object ob[]= new Object[5];
	   ob[0]="24.3";
	   ob[1]="Reddy";
	   ob[2]='a';
	   ob[3]=27;
	   ob[4]=true;
	   
	   for(int h=0;h<ob.length;h++)
	   {
		   
		   System.out.println(ob[h]);
	   }
	   
	   System.out.println("--------");
	   
	   for(Object h:ob)
	   {
	   
		   System.out.println(h);
		   
	   
	 }

}
}
