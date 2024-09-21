package PracticePrograms;

public class SingletonClass {
	
public String str;
private static SingletonClass singleton_instance=null;
	
       //Make constructor as private
		
		private SingletonClass() {
			str= "In Singleton Constructor";
		}
		
		//Write a public static method (get Instance) that has return type of Object of this
		//Singleton Class
		
		public static SingletonClass getInstance() {
			if(singleton_instance == null) 
				singleton_instance= new SingletonClass();
			return singleton_instance;
				
			
		}
		
		public static void main(String[] args) {
			
			SingletonClass x=SingletonClass.getInstance();
			SingletonClass y=SingletonClass.getInstance();
			x.str= x.str.toUpperCase();
			
			System.out.println(x.str);
			System.out.println(y.str);
			
			y.str=y.str.toLowerCase();
			
			System.out.println(x.str);
			System.out.println(y.str);
			
			

			
			
			
			
		
		
		

	}

}
