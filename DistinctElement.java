import java.util.HashSet;
import java.util.Iterator;

public class DistinctElement {

    public static int[] distinctElement(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        int m = set.size();
        int ans[] = new int[m];
        Iterator<Integer> iterator = set.iterator();
        
        for (int i = 0; i < m; i++) {
            ans[i] = iterator.next();
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {12, 10, 9, 45, 2, 10, 10, 45};
        int ans[] = distinctElement(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
