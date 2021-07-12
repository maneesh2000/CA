package objectoriented23 ;

import java.awt.image.SampleModel;
import java.util.Scanner;
 
public class Objectoriyanted {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	int limit;
	int [][] a= new int[20][20];
	System.out.println("Enter the size of 2D array:");
	limit=sc.nextInt();
	Objectoriyanted =new Objectoriyanted; 
  o. getArray(limit,a);
 o.  displayArray(limit,a);
	

	}
	
	
	
	void getArray(int limit,int [][]arr) {
		
		int i,j;
		System.out.println("plese Enter values of the array:");
		for(i=0;i<limit;i++) {
			
			for(j=0;j<limit;j++) {
				
			arr[i][j]=sc.nextInt();
				
				
				
			}
			
		}
			
			
			
		}
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		void displayArray(int limit,int [][]arr) {
			
			
			int i,j;
			
			
			
			
			System.out.println("Array of elements");
			for(i=0;i<limit;i++) {
				
				for(j=0;j<limit;j++) {
					
					
					System.out.print(" "+arr[i][j]);
					
					System.out.print(" \n");
					
					
				}

				
				
				
			}
				
				
			
			
			
			
		
		
		
		
		
	}

}
