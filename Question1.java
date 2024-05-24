package HomeAssignment;

import java.util.Scanner;

class Commission {
    double sales;
    
    Commission(double sales) {
        this.sales = sales;
    }

    void getCommission() {
        if(sales > 0 && sales <= 500) {
            System.out.println("Commission: " + sales*0.02);
        }
        else if(sales > 500 && sales < 5000) {
            System.out.println("Commission: " + sales*0.05);
        }
        else if(sales >= 5000) {
            System.out.println("Commission: " + sales*0.08);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
} 

public class Question1{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Sales: ");
        Commission obj = new Commission(sc.nextInt());
        obj.getCommission();
        sc.close();
    }    
}