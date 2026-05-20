        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        int low = 0;
        for (int high = k-1; high < arr.length; high++) {
            boolean found = false;
            while (low < high) {
                if (arr[low] < 0) {
                    System.out.print(arr[low] + " ");
                    found = true;
                    break;
                } else {
                    low++;
                }
            }
            if(found == false){
                System.out.print(0+" ");
            }
            low++;
        }
