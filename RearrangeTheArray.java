

public class RearrangeTheArray {
    private static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static int[] rearrangeTheArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (arr[i] != i && arr[i] != -1) {
                int correctIndex = arr[i];
                swap(arr,  correctIndex,i);
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i) {
                arr[i] = -1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int ans[] = rearrangeTheArray(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
