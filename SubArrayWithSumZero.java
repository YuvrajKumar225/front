

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithSumZero {
    public static HashMap<int[], int[]> subArrayWithSumZero(int arr[]){
        int n=arr.length;
        HashMap<int[], int[]> result=new HashMap<>();
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum+=arr[j];
                if(sum==0){
                    result.put(new int[]{i}, new int[]{j});
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        HashMap<int[], int[]> ans = subArrayWithSumZero(arr);
        for (Map.Entry<int[], int[]> entry : ans.entrySet()) {
                int[] key = entry.getKey();
                int[] value = entry.getValue();
                System.out.println("(" + key[0] + ", " + value[0]+")");
            }
    }
}
