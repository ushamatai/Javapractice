package StringPrograms;

public class ReverseTheString {

	public static void main(String[] args) {
		String s="dohfsdfdsfdfga";
		char arr[]= s.toCharArray();
		
		for(int i=arr.length-1; i>=0; i--) {
			
			System.out.println(arr[i]);
			
			
		}
		
		System.out.println(arr[arr.length -2]);

	}

}
