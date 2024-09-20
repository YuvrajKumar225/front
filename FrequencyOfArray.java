

import java.util.HashMap;

public class FrequencyOfArray {
    public static HashMap<Integer,Integer> frequencyOfArray(int arr[]){
        HashMap<Integer,Integer> result=new HashMap<>();
        int n=arr.length;
        for(int i=0; i<n; i++){
            if(!result.containsKey(arr[i])){
                result.put(arr[i],result.getOrDefault(result, 1));
            }
            else{
                int currerntFrequency=result.get(arr[i]);
                result.put(arr[i],currerntFrequency+1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,3,1,2,5,5,6};
        HashMap<Integer,Integer> ans= frequencyOfArray(arr);
        System.out.println(ans);
    }
}
