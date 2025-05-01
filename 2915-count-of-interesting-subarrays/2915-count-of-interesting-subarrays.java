import java.util.*;

class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        Map<Integer, Long> map = new HashMap<>();
        map.put(0, 1L); // base case
        long res = 0;
        int count = 0;

        for (int num : nums) {
            if (num % modulo == k) count++;

            int mod = ((count - k) % modulo + modulo) % modulo;
            res += map.getOrDefault(mod, 0L);

            int key = count % modulo;
            map.put(key, map.getOrDefault(key, 0L) + 1);
        }

        return res;
    }
}
