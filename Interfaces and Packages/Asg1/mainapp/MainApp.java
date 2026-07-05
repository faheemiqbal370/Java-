package mainapp;
import electricity.BillCalculator;
import electricity.DomesticConsumer;
import electricity.CommercialConsumer;
import java.util.Scanner;

public class MainApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Domestic and 2 for Commercial");
        int type=sc.nextInt(); 
        System.out.println("Enter units: ");
        int units=sc.nextInt();
        BillCalculator b;
        if(type==1) b=new DomesticConsumer(units);
        else b=new CommercialConsumer(units);
        System.out.println("Bill = "+b.calculateBill());
    }
}