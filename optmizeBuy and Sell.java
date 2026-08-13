int min = arr[0]; int maxProfit =0;
         for(int j=1;j<arr.length;j++){
             min = Math.min(min,arr[j]);
             maxProfit = Math.max(maxProfit,(Math.abs(min-arr[j])));
         }
        System.out.println(maxProfit);
