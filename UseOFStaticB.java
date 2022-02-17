
// Q. Q1) Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block, static method & static variable respectively.


import java.util.Scanner;

public class UseOFStaticB {

	static String first_name;
	static String last_name;
	static int age;

	static {

		// here is assigned the value of all fields. because it will be execute first

		first_name = "Tomy";
		last_name = "Kumar";
		age = 18;

		// here i am going to print all values of employee which are i assigned in blog
	}

	public static void employeeData() {
		
		System.out.println("********* Details of Employee  ****************");

		System.out.println("Employee First Name : " + first_name);
		System.out.println("Employee Last Name : " + last_name);
		System.out.println("Employee Age  :" + age);

	}

	public static void main(String[] args) {

		// here i am calling employee mathod with class.name

		UseOFStaticB.employeeData();

	}

}






