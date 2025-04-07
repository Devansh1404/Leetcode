class Solution {
    public int arrayPairSum(int[] nums) {
     Arrays.sort(nums);  // Sort the array
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i]; // Add every alternate element
        }
        return sum;   
    }
}