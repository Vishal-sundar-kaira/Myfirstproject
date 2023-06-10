package Array;
import java.util.HashMap;
import java.util.Map;

public class KthSmallestElement {
    public static int findKthSmallest(Map<Integer, Integer> map, int k) {
        int freq = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            freq += entry.getValue();
            if (freq >= k) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int N = 5;
        int K = 2;
        int[] arr = { 12, 3, 5, 7, 19 };

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int ans = findKthSmallest(map, K);
        System.out.println("The " + K + "th smallest element is " + ans);
    }
}
