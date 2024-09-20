

import java.util.ArrayList;
import java.util.List;

public class PrintAllTheLeaders {
    public static List<Integer> printAllTheLeaders(int arr[]){
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<n; i++){
            int currentElement=arr[i];
            boolean flag=true;
            for(int j=i+1; j<n; j++){
                if(arr[j]>currentElement){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        List<Integer> ans = printAllTheLeaders(arr);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
