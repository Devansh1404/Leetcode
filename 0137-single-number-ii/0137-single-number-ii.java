class Solution {
    public int singleNumber(int[] nums) {
       
       for (int i = 0; i < nums.length; i++) {
            int count = 0;
            
            // Count occurrences of nums[i]
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            
            // If count is 1, it's the unique number
            if (count == 1) {
                return nums[i];
        
            }

        }
        return 0;
    }
}