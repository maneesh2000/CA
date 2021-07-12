import java.util.Scanner;

public class TwoDimensionalArray {
    static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		int [][]a=new int[4][4];
		System.out.println("Enter the size of the array:");
		int size=s.nextInt();

		TwoDimensionalArray obj=new TwoDimensionalArray();
		
		obj.getArray(size,a);
		obj.displayArray(size,a);
	}
	
	
	void getArray(int size,int [][]a)
	{
		
		System.out.println("Enter the array value:");
		
		for(int i=0;i<size;i++) {
			
			
			for(int j=0;j<size;j++) {
				
				a[i][j]=s.nextInt();
				
				
				
			}
			
	
		}
		
		
	
		
		
	}
	
	
	
	
	void displayArray(int size,int [][]a)
	
	{
		
		System.out.println("Array element:\n");
		for(int i=0;i<size;i++) {
			
			for (int j=0;j<size;j++) {
				
				System.out.print(a[i][j]+" ");
				
				
				
			}
			System.out.println("\n");
			
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
