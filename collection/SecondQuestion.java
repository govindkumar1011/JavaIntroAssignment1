package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{

	String Name;
	double Age;
	double Salary;
	
	
	
	public Employee(String name, double age, double salary) {
		super();
		Name = name;
		Age = age;
		Salary = salary;
	}

	


	public String getName() {
		return Name;
	}




	public void setName(String name) {
		Name = name;
	}




	public double getAge() {
		return Age;
	}




	public void setAge(double age) {
		Age = age;
	}




	public double getSalary() {
		return Salary;
	}




	public void setSalary(double salary) {
		Salary = salary;
	}
	
	public String toString()
	{
		return Name +" : "+Age+" : "+Salary ;
	}



//
//	@Override
//	public int compareTo(Employee employee) {
//		// TODO Auto-generated method stub
//		return (int) (Salary - employee.getSalary());
//	}

//	
  
	
	public int compareTo(Employee employee)
	{
		return Name.compareTo(employee.Name);
	}
	
}










public class SecondQuestion {

	public static void main(String[] args) {
		
		List <Employee> employees=new ArrayList<Employee>();
	
	    Employee e1=new Employee("Tom", 21, 18000);
	    Employee e2=new Employee("Harry",23,19000);
	    Employee e3=new Employee("Jai",20,15000);
	    Employee e4=new Employee("Yash",20,15000);
	    Employee e5=new Employee("Nayan",20,15000);
	    
	    employees.add(e1);
	    employees.add(e2);
	    employees.add(e3);
	    employees.add(e4);
	    employees.add(e5);
	    
	    Collections.sort(employees);
	    
	    for(Employee e:employees)
	    {
	    	System.out.println(e);
	    }
	    
	}
	
	
}
