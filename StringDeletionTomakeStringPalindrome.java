public class StringDeletionTomakeStringPalindrome {
    public static boolean checkPalindrome(String remaining) {
        StringBuilder sb = new StringBuilder(remaining);
        String reverse = sb.reverse().toString();
        if (reverse.equals(remaining)) {
            return true;
        }
        return false;
    }

    public static int stringDeletionTomakeStringPalindrome(String str) {
        if (str.length() == 0 || str == null) {
            return -1;
        }
        int n = str.length();
        if (str.length() == 1) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (j == i) {
                    String removable = str.charAt(j) + "";
                    String remaining = str.replace(removable, "");
                    if (checkPalindrome(remaining)) {
                        return removable.length();
                    }
                } else {
                    String removable = str.charAt(i) + str.charAt(j) + "";
                    String remaining = str.replace(removable, "");
                    if (checkPalindrome(remaining)) {
                        return removable.length();
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "aebcbda";
        int ans = stringDeletionTomakeStringPalindrome(str);
        System.out.println(ans);
    }
}
