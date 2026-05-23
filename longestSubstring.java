 String  str = "abcabcbb";
        HashSet<Character> set = new HashSet<>();
        int low =0; int ans = Integer.MIN_VALUE;
        for (int right = 0; right < str.length() ; right++) {
              char ch = str.charAt(right);
              while(set.contains(ch)){
                  set.remove(str.charAt(low));
                  low++;
                  int lenght = right-low+1;
                  ans = Math.max(ans,lenght);
              }
           set.add(ch);
        }
        System.out.println(ans);
