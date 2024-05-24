  package LabAssignment;
import java.util.Scanner;
interface DetailInfo
{
	void count();
	void display();
}
class Person2
{
	String name;
	static int maxCount = 0;
	Person2(String name)
	{
		this.name = name;
	} 
	 void count()
	{
		maxCount = this.name.length();
	}
	 void display()
	{
		System.out.println("Your name: "+this.name);
		System.out.println("Number of character present: "+maxCount);
	}
}
public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name:");
		String name = sc.nextLine();
		Person2 p = new Person2(name);
		p.count();
		p.display();

	}

}
