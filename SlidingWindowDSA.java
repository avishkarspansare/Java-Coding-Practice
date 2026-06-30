public class SlidingWindowDSA {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 7, 8, 1, 2};
        int k = 3;

        int maxSum = maxSubarraySum(arr, k);

        System.out.println(maxSum);
    }

    public static int maxSubarraySum(int[] arr, int k) {

        int windowSum = 0;

        // Calculate first window sum
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}