  int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 15;
        int left =0; int sum =0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum==target){
                list.add(left+1);
                list.add(i+1);
                break;
            } else if (sum>target) {
                sum=sum-arr[left];
                left++;
                if(sum==target){
                    list.add(left+1);
                    list.add(i+1);
                    break;
                }

            }
        }
