public class FrequencyCountUsingArray {

    // Function to find max element
    static int maxEle(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 4};

        int max = maxEle(arr);

        int[] freq = new int[max + 1];

        // Count frequency
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        // Print frequency
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }
}
