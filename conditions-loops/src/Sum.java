import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int number, i = 1;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        for (i = 1; i <= number; ++i) {
            sum += i;
            in.close();
        }

        System.out.println(sum);

    }

}
