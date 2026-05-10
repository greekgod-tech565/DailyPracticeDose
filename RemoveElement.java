public class RemoveElement {

    public static int removeElement(int[] arr, int val) {

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != val) {

                arr[j] = arr[i];
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {

        int[] arr = {3,2,2,3};

        int length = removeElement(arr, 3);

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
