class Ebill{
    String type;
    int units;

    Ebill(String t, int u){
        type = t;
        units = u;

    }
    double calculate(){
        double bill = 0;
        if(units<=100) bill = units*2;
        else if (units<=200) bill = 100*2 +(units -100)*3;
        else bill= 100*2+100*3 +(units-200)*5;

        bill += bill*0.1;

        if(type.equals("domestic")) bill -=50;

        return bill;

    }
    public static void main(String[] args){
        Ebill e = new Ebill("domestic",250);
        System.out.println("Bill: "+ e.calculate());
    }
}