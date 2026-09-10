 int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};

        int leftMax = 0; int water =0;
        int rightMax = 0;

        int i = 0;
        int j = arr.length - 1;



        while (i < j) {
              if(arr[i]<=arr[j]){
                  if(arr[i]>=leftMax){
                      leftMax=arr[i];
                  }else {
                      water += leftMax - arr[i];
                  }
                  i++;
              }
              else {
                  if(arr[j]>=rightMax){
                      rightMax=arr[j];
                  }else {
                      water+=rightMax-arr[j];
                  }
                  j--;
              }

        }
        System.out.println(water);


    }
}
