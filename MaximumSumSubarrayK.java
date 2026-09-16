public class MaximumSumSubarrayK {

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 6, 3, 8};
        int k = 3;

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

      
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        maxSum = sum;

        
        for (int i = k; i < arr.length; i++) {

            sum = sum + arr[i] - arr[i - k];

            maxSum = Math.max(maxSum, sum);
        }

        System.out.println("Maximum Sum = " + maxSum);
    }
}
