package LabAssignment;
import java.util.Scanner;
abstract class mark{
	int markicp;
	int markdsa;
	double percentage;
abstract double getpercentage();
}
class CSE1 extends mark{
	int algodesign;

	CSE1 (int markicp, int markdsa, int algodesign){
		this.algodesign = algodesign;
		this.markicp = markicp;
		this.markdsa = markdsa;
	}
	double getpercentage() {
		percentage=(markicp + markdsa + algodesign)/300.0*100;
		return(percentage);
	}
}
class NonCSE1 extends mark{
	int enggmechanics;
	NonCSE1(int markicp, int markdsa, int enggmechanics){
		this.enggmechanics=enggmechanics;
		this.markicp = markicp;
		this.markdsa = markdsa;
	}
	double getpercentage() {
		percentage=((markicp + markdsa + enggmechanics )/300.0*100);
		return(percentage);

	}

}	
public class Abstarct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ICP and DSA marks: ");
		int icp = sc.nextInt();
		int dsa = sc.nextInt();
		System.out.println("Entr algo design marks ");
		int algo = sc.nextInt();
		System.out.println ("Enter enggMechanics Marks" );
		int enggMechanics= sc.nextInt();
		mark obj = new CSE1(icp,dsa,algo);
		mark obb=  new NonCSE1(icp,dsa,enggMechanics);
		System.out.println("Percentage of CSE student is " + obj.getpercentage());
		System.out.println("Percentage of NonCSE student is " + obb.getpercentage());

	}

}

