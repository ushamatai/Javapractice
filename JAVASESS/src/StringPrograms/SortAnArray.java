package StringPrograms;

public class SortAnArray {

	public static void main(String[] args) {
		 int a[]= {2,5,5,7,8,3};
		 int temp=0;
		 
		 //Ascending order
		 for (int i = 0; i < a.length; i++)   
		 {  
		 for (int j = i + 1; j < a.length; j++)
		 {
			 
			 if(a[i]>a[j]) {
				 
				 
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
				 
			 }
		 }
		 System.out.println(a[i]);
	}
		 
		 System.out.println("Decending ");
		 
		 //Descending 
		 for (int i = 0; i < a.length; i++)   
		 {  
		 for (int j = i + 1; j < a.length; j++)
		 {
			 
			 if(a[i]<a[j]) {
				 
				 
				 temp=a[j];
				 a[j]=a[i];
				 a[i]=temp;
				 
			 }
		 }
		 System.out.println(a[i]);
	}
		 
		 System.out.println("3rd largest" + (a.length-3));
		 
		

}
	
}

