 static void main() {
        int [] arr = {2,3,1,2,4,3};
        int target = 7; int sum =0; int left = 0; int min = Integer.MAX_VALUE; int right = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while (sum >= target) {
                min = Math.min(min, i - left + 1);
                sum = sum - arr[left];
                left++;


            }
        }

     if(min==Integer.MAX_VALUE) min=0;

        System.out.println(min);
    }
}
