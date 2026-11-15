 static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password : ");
        boolean ans = false;
        String pass = sc.nextLine(); int upper = 0;
        int lower = 0;
        int digit = 0;
        int special = 0;
        for (int i = 0; i < pass.length(); i++) {
            Character ch = pass.charAt(i);
            if (ch >= 65 && ch <= 90) {
                upper++;
            }
            else if (ch >= 97 && ch <= 122) {
                lower++;
            }
            else if (ch >= 48 && ch <= 57) {
                digit++;
            }
            else {
                special++;
            }

        }
        if (pass.length() >= 8 && upper > 0 &&
                lower > 0 && digit > 0 && special > 0) {
            System.out.println("valid password");
        }else System.out.println("Invalid password");
    }
}
