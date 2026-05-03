  int [] arr = {2, 4, 4, 4, 6, 8}; int target = 4; int ans = -1;
        int low = 0, high= arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                ans = mid;
                low=mid+1;
            } else if (arr[mid]<target) {
                low = mid+1;
            }else {
                high=mid-1;
            }
        }
        System.out.println(" the last Occurrence of target at index : "+ans);
