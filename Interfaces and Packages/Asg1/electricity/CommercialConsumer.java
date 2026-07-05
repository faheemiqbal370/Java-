package electricity;
public class CommercialConsumer implements BillCalculator{
    int units; 
    public CommercialConsumer(int u){ units=u; }
    public double calculateBill(){ return units*9; }
}
