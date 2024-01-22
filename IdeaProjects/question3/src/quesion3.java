
public class quesion3 {
    public static void main(String[] args) {
        int [] vec ={220,76,29,782,198,507,1021,1011};
        // We want to check which element of the above vector is prime number.
        // You should develop the checkPrime method for the app class.
        // Note that you cannot change the main method.
        // checkPrime method should receive an integer value and checks whether it is a prime number.
        for (int i=0;i<vec.length;i++){

            {
                System.out.println("Element# "+(i+1)+" is a prime number.");}
            int num = 29;
            boolean flag = false;
            for (i = 2; i <= num / 2; ++i) {
                // condition for nonprime number
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
    }
        }


