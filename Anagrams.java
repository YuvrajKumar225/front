public class Anagrams {
    public static boolean anagrams(String str1, String str2){
        int n=str1.length();
        int flag=0;
        for(int i=0; i<n; i++){
            if(str2.contains(str1.charAt(i)+"")){
                flag=0;
            }
            else{
                flag++;
            }
        }
        if(flag==0){return true;}
        else{return false;}
    }
    public static void main(String[] args) {
        String str1="silent";
        String str2="listen";
        boolean ans=anagrams(str1,str2);
        System.out.println(ans);
    }
}
