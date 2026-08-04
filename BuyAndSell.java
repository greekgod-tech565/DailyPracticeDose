 int[] arr = {7, 1, 5, 3, 6, 4};
        int minPrice=arr[0]; int profit =0; 
        for (int j =1 ; j < arr.length; j++) {
            if(minPrice>arr[j]) {
                minPrice = arr[j];
            }
                profit = Math.max(profit, arr[j] - minPrice);
        }
        System.out.println(profit);
              }
