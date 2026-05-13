 int[]arr={1,8,6,2,5,4,8,3,7};
        int i =0; int j = arr.length-1;
        int max_water =-1;
        while (i<=j){
            int h = Integer.min(arr[i],arr[j]);
            int width = j-i;
            max_water =Integer.max(max_water, h * width);
            if(arr[i]<arr[j]){
                i++;
            }else j--;
        }
        System.out.println(max_water);
