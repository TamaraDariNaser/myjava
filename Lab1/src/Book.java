
public class Book {
	
	public String title;
	public String author;
	String year;
	//methods
	
	static void PrintTitle() 
	
	{ 
		System.out.println("the seven habites");
	}
	
	static String PrintAuthor(String name) 
	{
		
		System.out.println("the name is "+ name);
		return name;	
	}
	
	static void PrintYear()
	{
		System.out.println("sixty three");
	}
	
	public static void main(String[] args) {
		
		PrintTitle() ;
		PrintAuthor("ali abd alaziz");
		PrintYear();
	}

}
