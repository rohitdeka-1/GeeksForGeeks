import java.util.*;

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int repeating = -1, missing = -1;

        
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        
        for (int i = 1; i <= n; i++) {
            if (map.containsKey(i) && map.get(i) == 2) {
                repeating = i;
            } else if (!map.containsKey(i)) {
                missing = i;
            }
        }

        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(repeating);
        ans.add(missing);
        return ans;
    }
}


