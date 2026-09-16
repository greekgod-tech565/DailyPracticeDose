static void main() {
        int[] arr = {5, 2, 9, 1, 6, 3, 8};
        int k = 3;
        int sum=0; double ans =0;
        for (int i= 0; i <k ; i++) {
            sum+=arr[i];


        }
        ans=(double)sum/k;
        System.out.printf("%.2f%n",ans);

        double avg=sum;
        for (int i = k; i <arr.length ; i++) {
            sum+=arr[i]-arr[i-k];
            avg = (double)sum/k;
            System.out.printf("%.2f%n",avg);
        }
