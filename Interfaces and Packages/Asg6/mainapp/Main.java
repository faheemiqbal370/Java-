package mainapp;
import vehicles.Car;
import fuel.FuelConsumption;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FuelConsumption f=new Car();
        System.out.println(f.calculateFuelCost(sc.nextDouble(),sc.nextDouble()));
    }
}   