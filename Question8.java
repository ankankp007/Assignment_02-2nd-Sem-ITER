package LabAssignment;
import p1.Test;
import p2.Sports;

public class Question8 extends Test implements Sports
{
	public int returnTotal()
	{
		return this.mark1+this.mark2;
	}
	public static void main(String[] args)
	{
		Question8 ob = new Question8();
		ob.input("Sankar",10,50,60);
		ob.display();
		System.out.println("Total marks: "+ob.returnTotal());
		System.out.println("Score 1: "+Score1);
		System.out.println("Score 2: "+Score2);
	}
}

