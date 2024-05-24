package LabAssignment;
class Person10{
	String name;
	int age;

	Person10(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
class Employeeee extends Person{
	int Eid; double salary;
	Employeeee(String name,int age,int Eid,double salary){
		super(name,age);
		this.Eid = Eid;
		this.salary = salary;
	}
	void empDisplay(){
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("employee id: " + Eid);
		System.out.println("salary: " + salary);
	}
}

public class Question9{
	public static void main(String[] args) {
		Employeeee obj1 = new Employeeee("pratham",18,9548,115000);
		obj1.empDisplay();
	}
}

