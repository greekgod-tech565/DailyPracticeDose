int max = Integer.MIN_VALUE;

for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {

        if (max < arr[i][j]) {
            max = arr[i][j];
        }
    }
}

System.out.println(max);
