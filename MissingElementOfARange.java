

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementOfARange {
    public static List<Integer> missingElementOfARange(int arr[]){
        int len=arr.length;
        Arrays.sort(arr);
        List<Integer> list=new ArrayList<>();
        int m=arr[0];
        int n=arr[len-1];
        // System.out.println(m+","+n);
        int index=0;
        for(int i=m; i<=n; i++){
            if(arr[index]!=i){
                list.add(i);
                // index++;
            }
            else{
                index++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[]={10, 12, 11, 15};
        List<Integer> ans=missingElementOfARange(arr);
        for(int num:ans){
            System.out.print(num+" ");
        }
    }
}
