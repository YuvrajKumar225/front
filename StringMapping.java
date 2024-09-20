import java.util.HashMap;
import java.util.Scanner;

public class StringMapping {
    public static boolean stringMapping(String str1, String str2) {
        HashMap<Character, Character> map = new HashMap<>();
        if (str1.length() != str2.length()) {
            return false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (!map.containsKey(str1.charAt(i))) {
                    map.put(str1.charAt(i), str2.charAt(i));
                } else {
                    char ch = str1.charAt(i);
                    if (map.get(ch) != str2.charAt(i)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean ans = stringMapping(str1, str2);
        System.out.println(ans);
        sc.close();
    }
}



