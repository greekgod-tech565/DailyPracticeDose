import java.util.*;

public class ArrayListQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter number of elements (N): ");
        int N = sc.nextInt();

        System.out.println("Enter " + N + " elements:");
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Enter query type (Q = 1 or 2): ");
        int Q = sc.nextInt();

        if (Q == 1) {
        
            int p = sc.nextInt(); // index
            int r = sc.nextInt(); // value
            list.add(p, r);
            System.out.println("Updated ArrayList: " + list);
        } else if (Q == 2) {
            // Search query
            int p = sc.nextInt(); // value to search
            int lastIndex = list.lastIndexOf(p);
            System.out.println(lastIndex);
        } else {
            System.out.println("Invalid query type!");
        }

        sc.close();
    }
}
