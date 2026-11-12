  int[] arr = {1,2,3,4,1}; int k =2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=k){
                map.put(arr[i], map.get(arr[i])-1);
                if(map.get(arr[i])==0){
                    map.remove(arr[i]);
                }
            }
        }
        System.out.println(map);
        System.out.println(map.size());
    }
