package programe24;

import java.util.Scanner;

public class MyClass extends Area {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("1.Circle\n 2. square\n 3.Rectangke\n4.Triangle\nEnter choise:");
		
		int choice=sc.nextInt();
		MyClass obj=new MyClass();
		
		switch (choice) {
		
		case 1:
			
			
			
			obj.circle();
			
			break;
		
        case 2:
			
			
			
			obj.square();
			
			break;
		
          case 3:
			
			
			
			obj.rectangle ();
			
			break;
		
		
          case 4:
  			
  			
  			
  			obj. triangle();
  			
  			break;
  			
  			

			default:
				
				
				System.out.println(" checke your choice!!");
			
			
			
		
		}
		
		
	

	}
	
	void circle()
	{
		
		System.out.println(" Enter the Radius:");
		
		int radius=sc.nextInt();
		circle(radius);
	
	
	}
	
	void square()
	{
		
		System.out.println(" Enter the size square:");
		
		int size=sc.nextInt();
		square(size);
	}
	
	
	void rectangle()
	{
		
		System.out.println(" Enter the length:");
		
		int length=sc.nextInt();
		System.out.println("Enter the  breadth:");
		int breadth=sc.nextInt();
		rectangle(length,breadth);
	}
	
	
	void triangle()
	{
		
		System.out.println(" Enter the base:");
		
		int base=sc.nextInt();
		System.out.println(" Enter the height:");
		int height=sc.nextInt();
		triangle(base,height);
		
	}
	
	
	
	
	
	
	
	

}
