public class StringCompression {
    public static String compress(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        int n=str.length();
        StringBuilder compressed = new StringBuilder();
        for(int i=0; i<n; i++){
            int count=1;
            while(i<n-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            if(count==1){
                compressed.append(str.charAt(i));
            }
            else{
                compressed.append(str.charAt(i));
                compressed.append(count);
            }
        }
        return compressed.toString();
    }
    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa")); // Should print "a2b1c5a3"
        System.out.println(compress("abcd")); // Should print "abcd"
    }
}
