 int [] arr ={3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
        int l=0; int count =0; int product =1;
        int r=0; int k=100;
        while (l<arr.length){
            product*=arr[r];
            if(product<k){
                count++;
                r++;
            }else{
                l++; r=l;
                product=1;
            }
            if(r== arr.length){
                l++; r=l ; product=1;
            }
        }
        System.out.println(count);
        // optmize solution
        int left = 0;
        int productONe = 1;
        int countONE = 0;
        if (k <= 1) {
            System.out.println(0);;
        }

        for (int right = 0; right < arr.length; right++) {

            product *= arr[right];

            while (productONe >= k) {
                productONe /= arr[left];
                left++;
            }

            countONE += right - left + 1;

        }

        System.out.println(countONE);;
    }
}
