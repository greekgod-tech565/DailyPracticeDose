 int [] arr = {1,1,2,2,3,3,4};
    
     int i =0;
        for (int j = 1; j< arr.length ; j++) {
            if(arr[i]==arr[j]){
                i++;
            }else {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
            }
        }
        for (int j = 0; j<=i ; j++) {
            System.out.print(arr[j]+" ");
        }
