import java.util.Scanner;

//Q3) Write a java program to show following menu to the user:
//
//*******Menu*******
//1. Calculate Area of Circle
//2. Calculate Circumference of a Circle
//3. Exit.
//Choose an option (1-3): 
//
//Take radius as user input.
//
//Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static







class UserMenu {

	static float pai = 3.14f;
	
	public static void main(String[] args) {
		
	cl_menu();
	

	}
	
	public static double areaOfCircle(double r)
	{
		double area=(pai*r*r);
		return area;
	}
	public static double circumferenceOfCircle(double r)
	{
		double circumference=2*pai*r;
		
		return circumference;
		
	}

	public static void cl_menu() {

		

		System.out.println("*********** MENU *************\n");

		System.out.println("******* Start here*******\n\n" + "1. Calculate Area of Circle\n"
				+ "2. Calculate Circumference of a Circle\n" + "3. Exit.");

		Scanner sc = new Scanner(System.in);

		System.out.println("Choose the options  :");

		int i = sc.nextInt();
		switch (i) {

		case 1: {
			System.out.println("Enter the enter the radius ");
			Double r = sc.nextDouble();

			double area=UserMenu.areaOfCircle(r);

			System.out.println("Area of Circle : " + area);

			break;
		}

		case 2: {
			System.out.println("Enter the enter the radius ");
			double r = sc.nextDouble();

			double circumference = UserMenu.circumferenceOfCircle(r);

			System.out.println("Circumference of a Circle : " + circumference);

			break;
		}
		case 3: {
			System.out.println("Exit");
			break;
		}

		default: {
			System.out.println("You have choosen incorrect option please enter the correct option");
		}

		}

	}

}

