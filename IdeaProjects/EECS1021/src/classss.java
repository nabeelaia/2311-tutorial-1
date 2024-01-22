import java.util.Scanner;
public class classss {
Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        int std= input.nextInt();

        {
        if (std < 215001 || std > 221999) {
        System.exit(0);
        } else {
        int l2d = std % 100;
        if (l2d < 33) {
        System.out.print(name + ", go to Room-I");
        } else if (l2d < 66) {
        System.out.print(name + ", go to Room-J");
        } else {
        System.out.print(name + ", go to Room-k");}
        }
        System.out.println(", located in the main hall.");
        }


        }

