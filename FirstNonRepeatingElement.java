

import java.util.Arrays;

public class FirstNonRepeatingElement {
    public static int firstNonRepeatingElement(int arr[]){
        int n=arr.length;
        int ans=0;
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i]!=arr[i+1]){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={-1, 2, -1, 3, 0};
        int ans=firstNonRepeatingElement(arr);
        System.out.println(ans);
    }
}
