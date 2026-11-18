  static void main() {
        int row = 4;
        int col = 4;
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int left = 0;
        int right = row - 1;
        int top = 0;
        int bottom = col - 1;
        while (left < right && top < bottom) {
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i]+" ");
            }
            top++;
           // System.out.println();
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right]+" ");
            }
            right--;
          //  System.out.println();
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

           // System.out.println();
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.println(arr[i][left] + " ");
                }
                left++;
            }

        }
    }
}
