package day4;

public class ForforDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*打印下面格式的*
		 *

		*
		**
		***
		****
		*****
		
		
		*/
		
		for(int x=1; x<=5;x++){
			
			for(int y=1;y<=x;y++){
				
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
		System.out.println("-------------");
		
		/*
		 
	 	54321
		5432
		543
		54
		5

		 
		 */
		
		for(int x=1; x<=5;x++){
			
			for(int y=5;y>=x;y--){
				
				System.out.print(y);
			}
			System.out.println();
		}
		
		
		System.out.println("-------------");
		
		
	
	 
		/*
		1
		22
		333
		4444
		55555
		
		*/

		
		for(int x=1; x<=5;x++){
			
			for(int y=1; y<=x; y++){
				System.out.print(x);
			}
			System.out.println();
			
		}
		
		System.out.println("-------------");
		/*
		
		* * * * * 
		-* * * *
		--* * * 
		---* * 
		----*
		*/
		
		
		/*
		for(int x=1; x<=5; x++){
			
			
			for(int y=5; y>=x; y--){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		*/
		
		for(int x=1; x<=5; x++)
		{
			for(int y=1; y<x; y++)
			{
				System.out.print(" ");
			}
			
			for(int z=x; z<=5; z++)
			{
				System.out.print("* ");
			}

			System.out.println();
		}

		
		
	}

}
