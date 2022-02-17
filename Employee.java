
/*       Q5) Create a class named Employee with fields firstname,lastname,age and designation. 
             The class should:

          have all types of constructors to initialize the object
          class should also have setter methods to update a particular field
          Override its toString method to display a meaningful message using all these fields.

 
  */


class Employee {
	static String FirstName;
	static String LastName;
	static int age;
	static String Designation;

	public Employee(String firstName, String lastName, int age, String designation) {
	
		FirstName = firstName;
		LastName = lastName;
		this.age = age;
		Designation = designation;
	}

	Employee() {
		System.out.println("*********** Employeee Details ***********");

	}
	
	
	// using toString Method

	public String toString() {
		return "First Name of Employee : " + FirstName + "\nLast Name is  : " + LastName + "\nage : " + age
				+ "\nDesignation : " + Designation;

	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public static void main(String[] args) {

		Employee e1 = new Employee("Tom", "Anti", 18, "Trainee");

		System.out.println("\n" + e1);

		e1.setAge(21);
		e1.setFirstName("Amit");
		e1.setLastName("Kumar");
		e1.setDesignation("Software Engineer");

		Employee e2 = new Employee();
		System.out.println("\n" + e2);

		// Employee e3=new Employee();

	}

}
