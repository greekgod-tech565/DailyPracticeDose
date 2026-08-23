import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {12, 23, 34, 45, 123, 135, 10};
        int k = 50;

        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {

            if (num < k && num >= 10) {

                int temp = num;
                boolean valid = true;

                while (temp >= 10) {

                    int digit1 = temp % 10;
                    int digit2 = (temp / 10) % 10;

                    if (Math.abs(digit1 - digit2) != 1) {
                        valid = false;
                        break;
                    }

                    temp = temp / 10;
                }

                if (valid) {
                    result.add(num);
                }
            }
        }

        System.out.println(result);
    }
}
