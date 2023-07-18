import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter input: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);
        input.close();
    }
}
