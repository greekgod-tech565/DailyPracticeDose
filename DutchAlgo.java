int[]arr =  {2,0,2,1,1,0};
        int low = 0; int mid = 0; int high = arr.length-1;
        while(mid<high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low]= arr[mid];
                arr[mid]=temp;
                low++; mid++;
            } else if (arr[mid]==2) {
                int temp = arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--; mid++;
            }
            else mid++;
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
