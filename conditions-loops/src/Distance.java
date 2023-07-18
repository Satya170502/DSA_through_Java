import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter X1 : ");
        double X1 = in.nextDouble();
        System.out.print("Enter X2 : ");
        double X2 = in.nextDouble();
        System.out.print("Enter Y1 : ");
        double Y1 = in.nextDouble();
        System.out.print("Enter Y2 : ");
        double Y2 = in.nextDouble();
        double x = X2 - X1;
        double y = Y2 - Y1;
        double xtotal = Math.pow(x, 2);
        double ytotal = Math.pow(y, 2);
        double distance = Math.sqrt((xtotal + ytotal));
        System.out.println(distance);
        in.close();
    }
}
