public int findMaxConsecutiveOnes(int[] nums) {
        int count=0; int n = nums.length;
        int maxCount=0;
        for(int j=0;j<n;j++){
            if(nums[j]==1){
                count++;
            }else{
                maxCount=Math.max(maxCount,count);
                count=0;
            }
        }
        return Math.max(maxCount,count);
    }
}
