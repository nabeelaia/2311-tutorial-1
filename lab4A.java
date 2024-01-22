
import java.util.Scanner;
public class lab4A {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.print("THis program receives an integer vector and checks if it has any element divisible by N & M.");
        Scanner integer = new Scanner(System.in);
        System.out.print("ENter an integer value for N:");
        int N = integer.nextInt();
        Scanner value = new Scanner(System.in);
        System.out.print("ENter an integer value for M:");
        int M = value.nextInt();
        System.out.print("Enter you integer vector elements below (comma seperated)");
        System.out.print("ONly enter numbers (do not use any letter space)");
        Scanner ints = new Scanner(System.in);
        String t = integer.nextLine();
        String vector = integer.next();
        String[] array = vector.split("");
        integer.nextLine();
        int index = 0;
        int[] num = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            num[i] = Integer.parseInt(array[i]);
            for (int j = 0; j < array.length; j++) {
                boolean divisible1 = num[j] % M == 0;
                boolean divisible2 = num[j] % N == 0;
                if (divisible1 && divisible2) {
                    index = j + 1;
                    break;
                }
            }
            if (index > 0) {
                System.out.println(num[i] + " is divisible by M and N");
            } else {
                System.out.println("No element is divisble by " + M + "and" + N);
            }





    long endTime = System.currentTimeMillis();
    long duration = endTime - startTime;
      System.out.print("execution time:"+duration+"milliseconds");

}










    }
}
