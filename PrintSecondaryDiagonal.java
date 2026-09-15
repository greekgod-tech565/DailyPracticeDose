 int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Secondary Diagonal:");

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][n - 1 - i] + " ");
        }
