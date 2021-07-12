import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
	
		
		
		System.out.println(" Enter the marks scored by the studentse");
		
		
		
		Scanner num=new Scanner(System.in);
		System.out.println("Written test =");
		
		float text=num.nextInt();
		
		System.out.println(" " + text);
		
		
		System.out.println("Lab exams = ");
		float lab=num.nextInt();
				System.out.println(" " + lab);
	
				
				
		 System.out.println("Assignments = ");
	    float Assignments=num.nextInt();
	   

		System.out.println(" " + Assignments);

	    
	    
		float grade= (text*70)/100 + (lab*20)/100 + ( Assignments*10)/100;
		
		System.out.println("Grade of the student is  " + grade);
		
		

	}

}
