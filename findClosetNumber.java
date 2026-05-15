 int[] arr = {-1,2,1,-4}; int target =1;
        Arrays.sort(arr); int closetSum = arr[0]+arr[1]+arr[2];
        for (int i = 0; i < arr.length ; i++) {

            if((i > 0 && arr[i] == arr[i-1])){
                continue;
            }
             int left = i+1;
             int right= arr.length-1;
             while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                 if(Math.abs(sum-target)<Math.abs(closetSum-target)){
                     closetSum=sum;
                 }
                if (sum == 1) {
                   // System.out.println( " [ " + arr[i] + " " + arr[left] + " " + arr[right] + " ] ");
                    left++ ; right--;
                } else if (sum < 0) {

                     left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println(closetSum);
    }
}
