 String Str = "abca"; int leftMax = Integer.MIN_VALUE;
       int left =0  ;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < Str.length(); i++) {
            Character ch = Str.charAt(i);
            while (map.containsKey(ch)){
                Character leftc = ch;
                map.remove(leftc);
                left++;
            }
            map.put(ch,1);
            leftMax=Math.max(leftMax,i-left+1);
        }
        System.out.println(leftMax);
