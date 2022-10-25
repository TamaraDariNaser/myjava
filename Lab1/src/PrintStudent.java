import java.util.ArrayList;

public class PrintStudent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList <String> Student= new ArrayList <String>();
			Student.add("Tamara");
			Student.add("Ali");
			Student.add("Haider");
			Student.add("Buthena");
			Student.add("Saja");
			//
			 ArrayList <Integer> Mark= new ArrayList <Integer>();
			 Mark.add(20);
			 Mark.add(30);
			 Mark.add(60);
			 Mark.add(50);
			 Mark.add(40);
			 
			for(int i=0; i<Mark.size();i++) 
			{ 
				if(Mark.get(i)>=40)
				System.out.println(Student.get(i));
			}
			
			
	}

}
