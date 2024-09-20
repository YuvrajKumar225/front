

public class ArrangeArray {
    public static int[] arrangeArray(int arr[]){
        int n=arr.length;
        int index=0;
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                arr[index]=arr[i];
                index++;
            }
        }
        for(int i=index; i<n; i++){
            arr[i]=0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,4,3,0,5,0};
        int ans[]=arrangeArray(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
