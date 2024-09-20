public class LongestPalindrome {
    private static boolean helper(String sub) {
        String reverse = "";
        for (int i = sub.length() - 1; i >= 0; i--) {
            reverse += sub.charAt(i);
        }
        if (reverse.equals(sub)) {
            return true;
        } else {
            return false;
        }
    }

    public static String longestPalindrome(String str) {
        int n = str.length();
        if (str == null || n < 2) {
            return str;
        }
        String longest = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <=n; j++) {
                String sub = str.substring(i, j);
                if (helper(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String str = "babadab";
        String ans = longestPalindrome(str);
        System.out.println(ans);
    }
}
