 package p1;
public class Student
{
	String name;
	int roll;
	void input(String name, int roll)
	{
		this.name = name;
		this.roll = roll;
	}
	void display()
	
		{
			System.out.println("Name: "+this.name);
			System.out.println("Roll: "+this.roll);
		}
}