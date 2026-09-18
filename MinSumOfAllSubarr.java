int[] arr1 = {5, 2, 9, 1, 6, 3, 8};
        int k1 = 3;
        int sumMin =0; int minSum=Integer.MIN_VALUE;
        for (int i = 0; i < k1 ;i++) {
            sumMin+=arr1[i];
        }
        minSum=sumMin;
        for (int i = k1; i < arr1.length ; i++) {
            sumMin=sumMin+arr1[i]-arr1[i-k];
            minSum=Math.min(minSum,sumMin);

        }
        System.out.println(minSum);
    }
