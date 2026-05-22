int[] arr = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;
        int low = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int high = k - 1; high < arr.length; high++) {
            for (int i = low; i <= high; i++) {
                boolean isDuplicate = false;
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (isDuplicate==false) {
                    sum+=arr[i];
                }
            }
            max = Math.max(max, sum);
            sum=0;
           // System.out.print(max + " ");
            low++;
        }
        System.out.println(max);
    }
