import java.util.Scanner;

public class programe {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the limit");
		
		int limit=scan.nextInt();
		int []array=new int [100];
		
		
 	

		System.out.println(" Enter the values of arry:\n");
		
		for(int num=0;num<limit;num++) {
			
			array[num]=scan.nextInt();
			
			
		}
		
		

       System.out.println("resalt:\n");
         
       for(int num=0;num<limit;num++) {
			
			array[num]=(array[num])*array[num+1];
			 System.out.println(""+array[num]);
		}
		

	}

}
