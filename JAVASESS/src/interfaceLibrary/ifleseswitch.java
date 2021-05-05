package interfaceLibrary;

public class ifleseswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String browser= "chrome";
//	if(false)
//	{
//		System.out.println("Inside true");
//		
//		
//	}
//	else//Dead code as true condition so it will never come in else
//	{
//		System.out.println("not inside if");
//	}

		//1. if only statements
		//All the if and separately all else is executed
		
		if (browser.equals("chrome"))
		{
			System.out.println("Launch Chrome");
			
		}
		
		if (browser.equals("firefox"))
		{
			System.out.println("Launch firefox");
		}
		if (browser.equals("safari"))
		{
			System.out.println("Launch safari");
		}
		
		else
		{
		
			System.out.println("enter correct browser");
	}

		
		//2.else if statements
		
		if(browser.equals("chrome"))
		{
			System.out.println("Chrome is Launched");
		}
		
		else if (browser.equals("firefox"))
		{
			System.out.println("firefox is Launched");
		}
		
		
		else if (browser.equals("safari"))
		{
			System.out.println("safari is Launched");
		}
		
		else
		{
			
			System.out.println("Browser is launched");
			
		
		}
		
		
		//3.Switch
		//So switch will directly take the beowser variable value and hop to required switch statement
		//it wont go in next statement if break is added.
		//if break is not added then it will execute all switch statements until there is break
		switch (browser) {
		case "chrome":
		System.out.println("Chrome is launched");
		break;
		case "firefox":
		System.out.println("firefox is launched");
		break;
		case "safari":
		System.out.println("safari is launched");
		break;
		default:
		System.out.println("Enter correct browser");
        break;
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
	
