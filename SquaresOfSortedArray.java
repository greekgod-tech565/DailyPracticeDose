import java.util.Arrays;

public class SquaresOfSortedArray {

    public static int[] sortedSquares(int[] arr) {

        int n = arr.length;

        int[] result = new int[n];

        int left = 0;
        int right = n - 1;

        int k = n - 1;

        while (left <= right) {

            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare) {

                result[k] = leftSquare;
                left++;
            }

            else {

                result[k] = rightSquare;
                right--;
            }

            k--;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {-4,-1,0,3,10};

        System.out.println(
            Arrays.toString(sortedSquares(arr))
        );
    }
}
