public class leader {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        ArrayList<Integer>list = new ArrayList<>();
        int maxRight = arr[arr.length-1];
        list.add(maxRight);
        for (int i = arr.length-2; i>=0 ; i--){
            if(arr[i]>maxRight){
                maxRight=arr[i];
                list.add(maxRight);
            }
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
