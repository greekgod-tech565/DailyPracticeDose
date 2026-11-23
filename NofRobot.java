 static void main() {
        int[] ct = {7,2,9,4};
        Deque<Integer> de = new ArrayDeque<>();
        int[]rc = {3,1,5,4}; int right =0,left =0; int sum =0;
        int budget = 25; int max =0;
        
        for (int i = 0; i <rc.length ; i++) {
            while (!de.isEmpty() && ct[de.peekLast()] <= ct[i]) {
                de.removeLast();
            }
            de.addLast(i);
                     sum+=rc[i];
            int cost = ct[de.peekFirst()]+(i-left+1)*sum;
            while(cost>budget){
                sum=sum-rc[left];
                left++;
                 cost = ct[de.peekFirst()]+(i-left+1)*sum;
            }

            max=Math.max(max,i-left+1);
        }
        System.out.println(max);
    }
}
