import java.util.Scanner;

public class Tax {

	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		    
		  System.out.print("Enter the annual income:");
			float income=sc.nextFloat();
			
			float tax;
			
			if(income<=250000){
			    
			    System.out.print("not Tax");
			    
			}else if (income>250000 && income<=500000){
			        
			        
			        tax=(income*5)/100;
			        
			        System.out.print("INCOME TAX AMOUNT IS"+tax);
			        
			    }else if(income>5000000 && income<=1000000){
			        
			        tax=(income*20)/100;
			        
			        System.out.print("INCOME TAX AMOUNT IS:"+tax);
			    }else if(income>1000000 && income<=5000000){
			        
			        
			        tax=(income*30)/100;
			        System.out.print("INCOME TAX AMOUNT IS:"+tax);
			        
			        
			    }else{
			        
			          System.out.print("please check your income");
			        
			        
			    }
		
		
		
		
		
		

	}

	}

