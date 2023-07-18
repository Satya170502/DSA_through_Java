public class FindMin {
    public static void main(String[] args) {
        int[] arr = { 101, 55, 30, 50, 60, 78, 22 };
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
