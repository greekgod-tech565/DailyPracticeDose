 int[] arr = {5,3,1,8,3,23,2};
        int x=2,y=5;
        int lastX=-1,lastY=-1; int ans = Integer.MAX_VALUE; int ans1=ans ;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x||arr[i]==y){
                if(arr[i]==x){
                    lastX=i;
                }
                else if(arr[i]==y){
                    lastY=i;
                }
                if(lastX>=0 && lastY>=0){
                    ans= Math.min( (Math.abs(lastX-lastY)),ans);
                }

            }


        }

        if(ans == ans1){
            System.out.println(-1);
        }
        System.out.println(ans);
    }
    }
    
