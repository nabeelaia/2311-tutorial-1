import java.util.Scanner;
public class lab5A {
    public static void main(String[] args) {

        String[] stringVector = getStringVector();
        System.out.printf("The longest string element is \"" + longestStringElement(stringVector) + "\"");
    }

    static String[] getStringVector() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of your string vector (A integer value");
        while (!scanner.hasNextInt()) {
            System.out.print("input is invalid Enter a positive value");
            scanner.next();
        }
        size = scanner.nextInt();
    } while (size<=0);
    scanner.nextLine();
    string[] vecctr


        }
        // This method returns a string vector which size and elements are received via keyboard entry.
        // Process:
        // 1- method asks the user to input a positive integer number for the size of the vector.
        //    Note that method should keep asking till a correct value is entered.
        // 2- method asks the user to input the elements of the vector one by one.
        // 3- method returns the created string vector.

        return new String[0];
    }

    static String longestStringElement(String[] strVec) {
        return null;
    }
}