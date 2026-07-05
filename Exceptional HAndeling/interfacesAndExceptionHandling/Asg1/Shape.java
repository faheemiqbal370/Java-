import java.util.Scanner;
interface Shape{ double calculateSalary(); }

class PermanentEmployee implements SalaryCalculator{
    double basic;
    PermanentEmployee(double b){ basic=b; }
    public double calculateSalary(){ return basic+basic*0.2+basic*0.1; }
}
class ContractEmployee implements SalaryCalculator{
    int hours; double rate;
    ContractEmployee(int h,double r){ 
        hours=h; 
        rate=r;
    }
    public double calculateSalary(){ return hours*rate; }
}

public class Asg2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Permanent Employee and 2 for Contract");
        int type=sc.nextInt();
        SalaryCalculator s;
        if(type==1){
        System.out.println("enter basic pay");
        s=new PermanentEmployee(sc.nextDouble());
        }    
        
        else{
        System.out.println("enter hours worked");
        int hours = sc.nextInt();
        System.out.println("enter hourly rate");
        double hourlyRate = sc.nextDouble();
        s=new ContractEmployee(hours,hourlyRate);

        } 
        System.out.println("Salary = "+s.calculateSalary());
    }
}