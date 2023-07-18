public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -18, -10, -4, 2, 3, 5, 6, 7, 8, 22, 55, 60, 66, 78 };
        int target = 5;
        int ans = binarysearch(arr, target);
        System.out.println(ans);

    }

    // return the index
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
