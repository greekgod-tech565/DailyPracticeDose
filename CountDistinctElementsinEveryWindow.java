  int [] arr = {1,2,1,3,4,2,3}; int k =4;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
         list.add(map.size());
        for (int i = k; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            map.put(arr[i - k], map.get(arr[i - k]) - 1);

            // If the frequency of arr[i - k] becomes 0, remove it
            if (map.get(arr[i - k]) == 0) {
                map.remove(arr[i - k]);
            }

            list.add(map.size());
        }
        System.out.println(list);
