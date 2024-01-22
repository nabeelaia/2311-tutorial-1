import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        double[] x={65.0,70.0,75.0,80.0,85.0,160.0,170.0,180.0,190.0,200.0,120.0,130.0,140.0,150.0,220.0};
        double[] y={0.025,0.031,0.038,0.047,0.058,0.618,0.792,1.002,1.255,1.55,0.20,0.27,0.36,0.476,2.32};
        System.out.print("Please input a real value for X between "+Arrays.stream(x).min().getAsDouble()+
                " and "+Arrays.stream(x).max().getAsDouble()+": ");
        Scanner input=new Scanner(System.in);
        double X=input.nextDouble();
        linInterp Y= new linInterp(x,y,X);
        System.out.println("The Y value for X="+X+" is: "+Y);
    }
}
