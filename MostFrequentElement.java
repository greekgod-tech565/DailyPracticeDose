 int[] arr = {40, 50, 30, 40, 50, 30, 30 };
       int max = 0; int ans =-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> i : map.entrySet()){
            int maxKey = i.getKey();
            int maxValue = i.getValue();
            if(maxValue>max || (maxValue==max&& maxKey>ans)){
                max = maxValue;
                ans = maxKey;

            }
        }
