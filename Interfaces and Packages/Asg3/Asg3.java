import java.util.*;
interface Result{ String calculateGrade(); }

class UGStudent implements Result{
    double p; UGStudent(double p){ this.p=p; }
    public String calculateGrade(){
        if(p>=90)return "A+";
        if(p>=80)return "A";
        if(p>=70)return "B";
        if(p>=60)return "C";
        return "D";
    }
}


public class Asg3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int total=0;
        System.out.println("enter marks for 5 subjects");
        for(int i=0;i<5;i++) total+=sc.nextInt();
        double per=total/5.0;
        Result r=new UGStudent(per);
        System.out.println("Percentage="+per);
        System.out.println("Grade="+r.calculateGrade());
    }
}