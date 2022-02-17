import java.util.Scanner;

//Q2) Write a program to read user input until user writes XDONE and then show the entered text by the user on commandline


class ReadUserINput {

	public static void main(String[] args) {

System.out.println("Enter , whatever you want to write  : but when will you write 'XDONE' than you will get your final output. ");
		
       Scanner sc = new Scanner(System.in);
		String a;
		String b = "";

		do {

			a = sc.next();


			b = b + " " + a;

		} while (!a.equalsIgnoreCase("XDONE"));

		System.out.println("No you have done \n ");

		System.out.println("all no :" + b + ",");
	}
}
