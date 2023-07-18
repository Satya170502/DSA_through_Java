import java.util.Arrays;

public class Searchin2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                { 30, 2, 1 },
                { 26, 88, 56, 59 },
                { 45, 56, 26 },
                { 45, 23 },
        };
        int target = 88;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
