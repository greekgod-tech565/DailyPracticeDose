int [] arr = {87, 89, 45, 235, 465, 765, 123, 987, 499, 655}; int k =1000;
        ArrayList<Integer>list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<k){
                int n = arr[i];
                boolean valid = true;
                while (n>=10){
                    int lastDigit = n%10;
                    int secondDigit = (n/10)%10;
                    if(Math.abs((lastDigit-secondDigit))!=1){
                        valid=false;

                        break;
                    }
                    n/=10;
                }
                if(valid) list.add(arr[i]);
            }
           
        }
        System.out.println(list);
    }
}
