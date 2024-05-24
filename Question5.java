 package HomeAssignment;
class PointType
{
	int xCoordinate,yCoordinate;
	 PointType(int x, int y)
	{
		this.xCoordinate = x;
		this.yCoordinate = y;
	}
      double returnXcoordinate()
	{
		return this.xCoordinate;
	}
	 double returnYcoordinate()
	{
		return this.yCoordinate;
	}
}
class CircleType extends PointType
{
	double radius, area, perimeter ;
	 CircleType(int x, int y, double r)
	{
		super(x,y);
		this.radius = r;
	}
	 void operation()
	{
		this.area = Math.PI*Math.pow(this.radius, 2);
		this.perimeter = 2*Math.PI*this.radius;
	}
	void display()
	{
		System.out.println("Circle center x = "+returnXcoordinate()+", and y ="+returnYcoordinate());
	    System.out.println("Circle radius: "+this.radius);
		System.out.println("Area of Circle: "+this.area);
		System.out.println("Perimeter of Circle: "+this.perimeter);
	}
}
public class Question5 {

	public static void main(String[] args)
	{
		CircleType CT = new CircleType(4, 8, 5.5);
		CT.operation();
		CT.display();
	}
}


