     public class Main {

    public static void main(String[] args) {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};

        int k = 3;

        int low = 0;

        for (int high = k - 1; high < arr.length; high++) {

            boolean found = false;

            // Current window check
            for (int i = low; i <= high; i++) {

                if (arr[i] < 0) {

                    System.out.print(arr[i] + " ");

                    found = true;

                    break;
                }
            }

            if (found == false) {
                System.out.print(0 + " ");
            }

            // Slide window
            low++;
        }
    }
}
