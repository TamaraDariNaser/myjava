
public class Person {
	//states
	 int age;
	String address;
	public String name;
	
	// Behavior
	 static void Walk() 
	{
		
		System.out.println("the person walks");
	}
	
	
	 static void Eat() 
	{
		
		System.out.println("the person eats");
	}
	 static void Sleep() 
	{
		
		System.out.println("the person sleeps");
	}
	public static void main(String[] args) {
		 
		Walk();
		Eat() ;
		Sleep() ;

	}

}
