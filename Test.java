package p1;

public class Test extends Student
{
	public int mark1,mark2;
	public void input(String n, int r, int m1,int m2)
	{
		super.input(n, r);
		this.mark1 = m1;
		this.mark2 = m2;
	}
	public void display()
	{
		super.display();
		System.out.println("Marks 1: "+this.mark1);
		System.out.println("Marks 2: "+this.mark2);
	}
}