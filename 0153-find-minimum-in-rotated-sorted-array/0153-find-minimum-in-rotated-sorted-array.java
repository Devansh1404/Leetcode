class Solution {
    public int findMin(int[] nums) {
         int n = nums.length;
        int start = 0;
        int end = n - 1;
        int minIdx = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid + 1 < n && nums[mid + 1] < nums[mid]) {
                minIdx = mid + 1;
                break;
            }
            if(nums[mid] < nums[n - 1]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return nums[minIdx]; 
    }
}