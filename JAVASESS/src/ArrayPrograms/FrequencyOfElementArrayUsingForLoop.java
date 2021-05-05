package ArrayPrograms;

public class FrequencyOfElementArrayUsingForLoop {

	public static void main(String[] args) {

		int arr[]=new int[]{2,2,5,5,5,6,2,6,2,2,2,4,4};
		int fr[]= new int[arr.length];
		int visited=-1;
		
		
		for(int i=0;i<arr.length;i++)
		{
			 int count=1;
			for(int j=i+1;j<arr.length; j++)
			{    
				if(arr[i]==arr[j])
				{
					fr[j]=visited;
					count++;
				}
				
				
			}
			if(fr[i]!=visited) {
				fr[i]=count;
			}
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(fr[i]!=visited & fr[i] >=2)
			{
				System.out.println("Frequency of  " + arr[i] + " : " + fr[i]);
			}
		}
		
		
		

	}

}
