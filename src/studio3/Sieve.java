package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a value for n: ");
		int numP = in.nextInt();
		
		boolean[] array = new boolean[numP+1];
		
		
		for (int i=1; i <= numP; i++) 
		{
			array[i] = true;
			System.out.println(array[i] + " ");
		}
		
		
		for (int n=2; n <= numP; n++) {
			for (int i=n; i <= numP; i+=n) {
				if (array[i] == true) {
					array[i] = false;
				System.out.println(array[i] + " ");
				}
			}
		}
				
			//
			//{
			//	array[i] = false;
				//System.out.println(array[i] + " ");
			//	n = n+1;
			//}
			
			//if (array[i] == true)
				//for (int i=2; i <= numP; i+=3)
				//{
					
		

		
		
		
		
		
		
		
		
		for (int i=1; i <= numP; i++) 
		{
			System.out.print(array[i] + " ");
			System.out.print(i);
		}
		
		
	}

}
