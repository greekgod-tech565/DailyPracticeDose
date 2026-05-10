import java.util.Arrays;

public class MoveNegativeNumbers {

    public static void moveNegative(int[] arr) {

        int left = 0;

        for (int right = 0; right < arr.length; right++) {

            if (arr[right] < 0) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,-2,3,-4,5,-6};

        moveNegative(arr);

        System.out.println(Arrays.toString(arr));
    }
}
