  int[]arr = {1,3,2,6,-1,4,1,8,2}; int k = 5; int sum =0;
for (int i = 0; i <k ; i++) {
            sum+=arr[i];
        }
        System.out.println((double) sum/k);
        for (int i = k; i < arr.length ; i++) {
            sum=sum-arr[i-k]+arr[i];
            double ans = (double) sum/k;
            System.out.println(ans);
        }
