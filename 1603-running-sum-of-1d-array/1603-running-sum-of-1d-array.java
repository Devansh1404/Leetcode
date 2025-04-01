class Solution {
    public int[] runningSum(int[] nums) {
        int s=0;
        int sum[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
             s+=nums[i];
             sum[i]=s;
        }
        return sum;
    }
}