import java.util.Scanner;

public class ArrayFuntion {
static	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int[][ ]a= new int[20][20];

	    int[][] b= new int [20][20];
	    int[][] sum= new int [20][20];
	    
	    System.out.println("Enter the limit of the array ");
	    int limit=sc.nextInt();
	    System.out.println("Enter the value in to the array 1");
		getArray(limit,b);
		addArray(limit,a,b,sum);
		displayArray(limit,sum);
		

	}
	
	static void getArray(int limit,int [][]d) {
		
		
		int i,j;
		
		for(i=1;i<limit;i++) {
			for(j=1;j<limit;j++) {
				
				d[i][j]=sc.nextInt();
				
			}
			
			
			
		}
		
		System.out.println("\n");
		
		
		
		
	}
	




	
	
	
	
	static void addArray(int limit ,int [][]a,int [][]b,int [][]sum) {
		
		int i,j;
		
for(i=1;i<limit;i++) {
			
	for(i=1;i<limit;i++) {
		for(j=1;j<limit;j++) {
			
			sum[i][j]=a[i][j]+b[i][j];
			
			
		}
		
		
	}
			
			
		}
		
	
		
		

		
		
	}
	

static void displayArray(int limit,int [][]sum) {
	
	int i,j;
	System.out.println("the sum of array 1 and array 2");
	
	for(i=1;i<limit;i++) {
		for(j=i;j<=limit;j++) {
			
			
			System.out.println(" "+sum[i][j]);
			
			
		}
		
	}
	
	
	
}

}



	



