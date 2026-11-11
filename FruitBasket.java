 static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        HashMap<Integer,Integer> map = new HashMap<>();
        int left =0; int max =0;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.size()>2){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
                left++;
            }
            max = Math.max(max,i-left+1);
        }
        System.out.println(max);
    }
