package HomeAssignment;
class Distance
{
	double meters, centimeters;
	 Distance()
		{
			this.meters = 0;
			this.centimeters = 0;
		}
	
	Distance(double meters, double centimeters)
	{
		this.meters = meters;
		this.centimeters = centimeters;
	}
	 Distance add(Distance d1, Distance d2)
	{
		Distance d3 = new Distance( meters,  centimeters);
		d3.meters = d1.meters + d2.meters;
		d3.centimeters = d1.centimeters + d2.centimeters;
		if(d3.centimeters>=100)
		{
			d3.meters += (int)(d3.centimeters/100);
			d3.centimeters = d3.centimeters%100;
		}
		return d3;
	}
	public void display()
	{
		System.out.println(this.meters+" "+this.centimeters);
	}
}
public class Question4
{
	public static void main(String[] args)
	{
		Distance d1 = new Distance(5, 70);
		Distance d2 = new Distance(15, 50);
		Distance d = new Distance();
	    d = d.add(d1,d2);
		d1.display();
		d2.display();
		d.display();
	}
}

