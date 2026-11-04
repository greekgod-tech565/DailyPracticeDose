ublic class hashmappracticesFour {
    static void main() {
        int[] arr1 = {1,2,5}; boolean ans = true;
        int[] arr2 = {1,2,15};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
                   map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(!map.containsKey(arr2[i])){
                ans = false; break;
            }
            if(map.get(arr2[i])==0){
                ans=false;
                break;
            }
            map.put( arr2[i],map.get(arr2[i]-1));
        }

        System.out.println(ans);
    }
}
