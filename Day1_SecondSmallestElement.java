 static int smallEle(int[]arr){
        int n = arr.length;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    static int secondSmall(int[]arr){
        int res = smallEle(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<min&&arr[i]!=res){
                min=arr[i];
            }
            if (min == Integer.MAX_VALUE) {
        System.out.println("No second smallest element");
        return -1;
    }
        }
        return min;
    }
    public static void main(String[] args) {
        int[]arr= {2,9,4,3,1};
        int res = secondSmall(arr);
        System.out.println(res);
    }
}
