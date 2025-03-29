class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int x = n - i; // The number of elements ≥ nums[i]
            if (nums[i] >= x) {
                // If the previous number was smaller than x, we found a valid special array
                if (i == 0 || nums[i - 1] < x) return x;
                 
            }
        }
        return -1;
    }
}