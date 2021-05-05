
public abstract class BMW  {
	
	BMW(){
		System.out.println("BMW invoked---constructor");
	}
	
	public  static void Start() {
		System.out.println("Start----BMW Class");
	}
	
	public  void bye() {
		System.out.println("bye-----BMW class");
	}

	
	public abstract void welcome();

}
