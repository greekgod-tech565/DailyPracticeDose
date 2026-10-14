   static void main() {
       int [] arr = {2, 7, 11, 15}; int target =9;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a = 0; a < arr.length; a++) {
            int need = target-arr[a];
            if(map.containsKey(need)){
                System.out.println(Arrays.toString(new int[]{map.get(need),a}));
                break;
            }else{
                map.put(arr[a],a);
            }
        }
        
