class Solution {
    public int missingNumber(int[] nums) {
       // Arrays.sort(nums);
       // for(int i=0;i<nums.length;i++){
       //     if(nums[i]==i) continue;
       //     else return i;
       // }
       // return 0;
        int n=nums.length;
        int tsum=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n;i++)
        sum+=nums[i];
        return (tsum-sum);
    }
}