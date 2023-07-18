import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int firstnumber = input.nextInt();
        System.out.print("Enter a Second number: ");
        int secondnumber = input.nextInt();
        if (firstnumber > secondnumber) {
            System.out.println(firstnumber + " is greater !");
        } else {
            System.out.println(secondnumber + " is greater !");
        }
        input.close();
    }
}
