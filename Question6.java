package LabAssignment;
import java.util.Scanner;
abstract class marks{
	int markicp;
	int markdsa;
	double percentage;
	marks(int markicp, int markdsa){
		this.markicp = markicp;
		this.markdsa = markdsa;
		System.out.println("Inside COnstructor");
	}
	abstract double getpercentage();
}
class CSE extends marks{
	int algodesign;
	CSE (int markicp, int markdsa, int algodesign){
		super(markicp,markdsa);
		this.algodesign = algodesign;
	}
	double getpercentage() {
		percentage=(markicp + markdsa + algodesign)/300.0*100;
		return(percentage);
	}
	class NONCSE extends marks{
		int enggmechanics;
		NONCSE (int markicp, int markdsa, int enggmechanics){
			super(markicp,markdsa);
			this.enggmechanics=enggmechanics;
		}
		double getpercentage() {
			return((markicp + markdsa + enggmechanics )/300.0*100);
		}

	}	

}
public class Question6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ICP and DSA marks ");
		int icp = sc.nextInt();
		int dsa = sc.nextInt();
		System.out.println("Entr algo design marks ");
		int algo = sc.nextInt();
		CSE student = new CSE(icp,dsa,algo);
		System.out.println("Percentage is " + student.getpercentage());
		
		sc.close();

	}

}


