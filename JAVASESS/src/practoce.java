import java.util.Arrays;

public class practoce {

	public static void main(String[] args) {
		
		
		String s="Hello";
		char charArray[]=s.toLowerCase().toCharArray();
		//char[] charArray = new char[] { 'A', 'Q', 'S', 'Z', 'P' };
		
		
		
		for(int i=0;i<charArray.length;i++) 
		{
			
			for(int j=i+1; j<charArray.length;j++)
{
			if(charArray[i]> charArray[j]) {
				
				char temp=charArray[i];
				charArray[i] =charArray[j];
				charArray[j]= temp;
				
			}
				
			}
		}
		
		System.out.println(charArray);
}
	
}
