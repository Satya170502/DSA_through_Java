import java.util.Arrays;
import java.util.Scanner;

public class Multi {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        for (int index = 0; index < arr.length; index++) {
            for (int col = 0; col < arr[index].length; col++) {
                arr[index][col] = in.nextInt();

            }

        }
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
        in.close();
    }

}
