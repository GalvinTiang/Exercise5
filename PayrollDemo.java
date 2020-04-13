
//TASK3
import java.util.Scanner;

public class PayrollDemo {
    public static void main(String[] args){
    
        Employee e = new Employee();
        e.input();
        
        Payroll p = new Payroll(e.grossPay,e.stateTax,e.federalTax);
        p.printOutput();
    }
}

class Employee{
    double employeeID, grossPay, stateTax, federalTax;

    public void input(){
        Scanner input = new Scanner(System.in);
        
        System.out.print(" Employee ID number : ");
        employeeID = input.nextDouble();
       
        System.out.print("Enter your Gross Pay :");
        grossPay = input.nextDouble();
        
        System.out.print("Enter your State Tax : ");
        stateTax = input.nextDouble();
     
        System.out.print("Enter your Federal Tax : ");
        federalTax = input.nextDouble();
        
    }
}
class Payroll{
    private double grossPay, stateTax, federalTax, netPay;

    public Payroll(double grossPay,double stateTax,double federalTax){
        this.grossPay = grossPay;
        this.stateTax = stateTax;
        this.federalTax = federalTax;
    }

    public double calculateNetPay(){
        return netPay = grossPay - stateTax - federalTax;
    }

    public void printOutput(){
        System.out.printf("Net pay is: RM%.2f", calculateNetPay());
    }
}
