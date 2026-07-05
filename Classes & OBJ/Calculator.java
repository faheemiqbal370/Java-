import java.util.Scanner;

class Calculator{
    double x,y;
    char op;   
     
    Calculator(double a, double b, char o){
        x = a;
        y = b;
        op = o; 
    } 
    
    double calculate(){
        double result=0;
        switch(op){
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                if(y==0){
                System.out.println("Division by zero mat karo!!");
                break;
                }
                result = (double)x / y;
                break;
            default:
                System.out.println("Invalid operator!!");
        }
        return result;
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("enter any of the following operators: + , - , * , /");
        char operator = sc.next().charAt(0); 
        String[] history = new String[5];
        
        Calculator c1 = new Calculator(a,b,operator);
        double result = c1.calculate();
        System.out.println("Result is: " + result);

    }
    
}