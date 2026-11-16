static void main() {
        int[] arr = {2, 5, 1, 7, 3, 6};
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE; int k =3;
        for (int i = 0; i < k; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        list.add(max);
        for (int i = k; i < arr.length; i++) {

            for (int j = i - k + 1; j <= i; j++) {
                if (arr[j] > max1) {
                    max1 = arr[j];

                }
            }
            list.add(max1);
        }

        System.out.println(list);
    }
}
