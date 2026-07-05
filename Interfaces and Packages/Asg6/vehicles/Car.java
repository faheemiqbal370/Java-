package vehicles;
import fuel.FuelConsumption;
public class Car implements FuelConsumption{
    public double calculateFuelCost(double d,double p){ 
        return (d/15)*p;
    }
}