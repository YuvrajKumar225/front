import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String words[]){
        String result="";
        int n=words.length;
        Arrays.sort(words);
        if (words == null || n == 0) {
            return "-1";
        }
        String first=words[0];
        String last=words[n-1];
        for(int i=0; i<first.length(); i++){
            if(first.charAt(i)!=last.charAt(i)){
                return result;
            }
            else{
                result+=first.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String strs[] = {"apple", "appetizer", "application", "apps"};
        String ans=longestCommonPrefix(strs);
        System.out.println(ans);
    }
}
