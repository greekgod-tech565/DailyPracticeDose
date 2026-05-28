public class LongestWord {

    public static void main(String[] args) {

        String str = "I LOVE PROGRAMMING";

        int max = 0;
        String longest = "";

        String[] word = str.split(" ");

        for (int i = 0; i < word.length; i++) {

            int count = word[i].length();

            if (count > max) {

                max = count;
                longest = word[i];
            }
        }

        System.out.println(longest);
    }
}
