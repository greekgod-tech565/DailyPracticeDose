 static void main() {
        int[]arr = {1,2,3,-2,2};
        int prefix=0; int sum =3;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1); int count =0;
        for (int i = 0; i < arr.length; i++) {
            prefix+=arr[i];
            int need = prefix-sum;
                count+=map.getOrDefault(need,0);

            map.put(prefix, map.getOrDefault(prefix,0)+1);
        }
        System.out.println(count);
    }
}
