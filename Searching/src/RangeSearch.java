public class RangeSearch {
    public static void main(String[] args) {
        int[] nums = { 10, 5, 3, 5, 6, 78, 22 };
        int target = 5;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
