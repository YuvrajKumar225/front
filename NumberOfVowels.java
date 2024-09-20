public class NumberOfVowels {
    public static int numberOfVowels(String str){
        String vowels="aeiou";
        int cnt=0;
        for(int i=0; i<str.length(); i++){
            if(vowels.contains(str.charAt(i)+"")){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        String str="education";
        int ans=numberOfVowels(str);
        System.out.println(ans);
    }
}
