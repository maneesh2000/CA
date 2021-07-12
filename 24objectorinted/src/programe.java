import java.util.Scanner;

public class programe {

	public static void main(String[] args) {
		static Scanner sc=new Scanner(System.in); 
		System.out.println("Enter your choise\n 1.circle \n 2.square \n 3.regtangle\n 4.triangle");
		int choice=sc.nextInt();
		
        MyClass obj1=new MyClass();
        
        
        switch(choice) {
        
        
        case 1 :
        	
        	
        	obj1.circle();
        
            break;
            
            
        case 2 :
        	
        	obj1.square();
            
            
            break;
        case 3:
        	
        	obj1.regtangle();
            
            break;
            
            
        
        }
        
        
        
        void circle() {
        	
        	System.out.println("Enter the Radius:");
        	int ra
        	
        }
        
        
        
        
        
        
        
        
        
	}

}
