package electricity;
public class DomesticConsumer implements BillCalculator{
    int units; 
    public DomesticConsumer(int u){ units=u; }
    public double calculateBill(){ return units*6; }
}