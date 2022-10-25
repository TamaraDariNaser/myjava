
public class Counter {
	 public static int Max=20;
	private  static int value;
	public void increment() 
	{
		System.out.println("Hi !increment ");
	}
	public  int GetValue() 
	{
		return this.value;
	}
	public void SetValue(int vvalue)
	{
		this.value=vvalue;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter v1= new Counter();
		v1. SetValue(10);
		System.out.println("the value=  "+v1.GetValue());
		for(int i=0; i<Max;i++) 
		{  value=value+1;
			if (value == Max)
			break;
		}
		System.out.println(value);
		}
	}
	


