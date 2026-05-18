   int[]arr = {-2,0,1,3};
        int target = 2; int count =0;
        for (int i = 0; i < arr.length; i++) {
            int left = i+1;
            int right = arr.length-1;
            while(left<right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum < target) {
                    count += (right - left);
                    left++;
                } else right--;
            }
            }
        System.out.println(count);
