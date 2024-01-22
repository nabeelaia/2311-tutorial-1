import java.util.Scanner;

public class quiz2 {



    public static void main(String[] args)
    {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the elements of your string vector (comma separated).");
                String Vec = input.next();
                System.out.println("Sum of the entered vector elements is :" + BVS(Vec));
        double num;
        double sum=0;
        while(true)
        {
            num=input.nextDouble(); //Read number
            if(num<0)
                break;
            sum +=num;
        }
        System.out.println( "Sum is : " +sum);
    }

            public static String BVS (String Vector){
                String [] VEC=Vector.split(",");
                int SUM=0;
                for (int i=0; i< VEC.length;i++) {
                    SUM = Integer.parseInt(VEC[i], 2) + SUM;
                }
                return Integer.toBinaryString(SUM);
            }}





