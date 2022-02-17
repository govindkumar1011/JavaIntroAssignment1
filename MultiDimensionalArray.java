import java.util.Scanner;


/*   Q4) Create a two dimensional array of integers and display:

           sum of all elements of each column
            sum of all elements of each row  
            
 */

class MultiDimensionalArray {

	public static void main(String[] args) {

		int a[][] = {

				{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }

		};
		
		showM(a);
		
		System.out.println();
		
        System.out.println("*******  Sum Of Row Elements **********");
		sumOfRowElement(a);
		System.out.println("********  Sum of Column Elements **********");
		sumOfColumnElement(a);

	}
	public static void showM(int a[][])
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void sumOfRowElement(int ar[][]) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				count = count + ar[i][j];

			}
			System.out.println("Sum of " + i + " Row : " + count);

			count = 0;
		}

	}

	public static void sumOfColumnElement(int a[][]) {
		int count=0;
		for(int j=0; j<a[0].length; j++)
		{
		for(int i=0; i<a.length; i++)
		{
		
			 count=count+a[i][j];
			}
			
			System.out.println("Sum of " + j + " Column: " + count);
			
			count=0;
		}

	}

}


