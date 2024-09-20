public class ReverseStringInArray {
    public static String reverseStringInArray(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String words[] = str.split(" ");
        int n = words.length;
        String result = "";
        for (int i = n - 1; i >= 0; i--) {
            if (i == 0) {
                result += words[i];
            } else {
                result += words[i] + "";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "i love programming very much";
        String ans = reverseStringInArray(s);
        System.out.println(ans);
    }
}
