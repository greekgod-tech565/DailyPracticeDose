 static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter for n number :");
        int n  = sc.nextInt();
        System.out.println("Enter for m number  : ");
        int m = sc.nextInt(); int count = 1;
        int ans = m; boolean flag = true; if(n==1) System.out.println(0);
        while (true) {
            if (ans<count){
                break;
            }
            ans= ans-count;
            count++;
            if(count>n){
                count=1;

            }
        }
        System.out.println(ans);
    }
