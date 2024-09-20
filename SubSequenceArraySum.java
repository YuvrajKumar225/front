

import java.util.HashSet;

public class SubSequenceArraySum {
    public static int subSequenceArraySum(int arr[], int target){
        int n=arr.length;
        int cnt=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(arr[i]);
            int remainingValue=target-arr[i];
            if(set.contains(remainingValue)){
                cnt++;
            }
        }
        return cnt;
    }

    // public static int subSequenceArraySum(int arr[], int target){
    //     int n=arr.length;
    //     int cnt=0;
    //     for(int i=0; i<n; i++){
    //         for(int j=i+1; j<n; j++ ){
    //             if((arr[i]+arr[j])==target){
    //                 cnt++;
    //             }
    //         }
    //     }
    //     return cnt;
    // }
    public static void main(String[] args) {
        int arr[]={1, 5, 7, -1, 5};
        int target=6;
        int ans=subSequenceArraySum(arr,target);
        System.out.println(ans);
    }
}
