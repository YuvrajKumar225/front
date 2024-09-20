

import java.util.HashMap;
import java.util.Map;

public class Pair {
    public static HashMap<int[], int[]> pair(int arr[]) {
        HashMap<Integer, int[]> map = new HashMap<>();
        HashMap<int[], int[]> result = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (map.containsKey(sum)) {
                    int[] temp = map.get(sum);
                    // System.out.println(temp[0] + " " + temp[1] + " " + arr[i] + " " + arr[j]);
                    result.put(new int[] { temp[0], temp[1] }, new int[] { arr[i], arr[j] });
                    return result;
                } else {
                    map.put(sum, new int[] { arr[i], arr[j] });
                }
            }
            // System.out.println(map);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 7, 1, 2, 9, 8 };
        HashMap<int[], int[]> ans = pair(arr);

        if (ans.isEmpty()) {
            System.out.println("No pairs found");
        } else {
            for (Map.Entry<int[], int[]> entry : ans.entrySet()) {
                int[] key = entry.getKey();
                int[] value = entry.getValue();
                System.out.println("(" + key[0] + ", " + key[1] + ") and (" + value[0] + ", " + value[1] + ")");
            }
        }
    }
}
