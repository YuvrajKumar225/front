public class FindAllPermutationOfString {
    public static StringBuilder findAllPermutationOfString(String str,StringBuilder sb){
        if(str.length()==0){
            System.out.println(sb);
            return sb;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            sb.append(ch);
            String ros=str.substring(0,i)+str.substring(i+1);
            findAllPermutationOfString(ros,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        return sb;
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(str.substring(0,0));
        StringBuilder sb=new StringBuilder();
        sb=findAllPermutationOfString(str,sb);
        System.out.println(sb);
    }
}
