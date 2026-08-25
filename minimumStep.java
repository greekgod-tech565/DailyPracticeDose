import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(-2);
        arr.add(4);
        arr.add(0);

        int steps = 0;
        int negativeCount = 0;
        boolean zeroPresent = false;

        for (int i = 0; i < arr.size(); i++) {

            int num = arr.get(i);

            if (num > 0) {
                steps += num - 1;
                arr.set(i, 1);
            }

            else if (num < 0) {
                steps += -num - 1;
                arr.set(i, -1);
                negativeCount++;
            }

            else {
                zeroPresent = true;
            }
        }

        if (negativeCount % 2 != 0) {

            if (zeroPresent) {
                steps += 1;

                for (int i = 0; i < arr.size(); i++) {
                    if (arr.get(i) == 0) {
                        arr.set(i, -1);
                        break;
                    }
                }
            }

            else {
                steps += 2;

                for (int i = 0; i < arr.size(); i++) {
                    if (arr.get(i) == -1) {
                        arr.set(i, 1);
                        break;
                    }
                }
            }
        }
        
        System.out.println("Array = " + arr);
        System.out.println("Steps = " + steps);
    }
}
