public class ReverseString{
    public static String reverseString(String str){
        int n=str.length();
        String result="";
        for(int i=n-1; i>=0; i--){
            result+=str.charAt(i)+"";
        }
        return result;
    }
    public static void main(String[] args) {
        String str="hello";
        String ans=reverseString(str);
        System.out.println(ans);
    }
}