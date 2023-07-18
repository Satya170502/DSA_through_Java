public class MAX {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 45, 18 };

        System.out.print(max(arr));
    }

    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }

        }
        return maxVal;
    }
}
