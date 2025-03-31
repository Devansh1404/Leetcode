class Solution {
    public int findMin(int[] nums) {
    //    int left=0;
    //    int right=nums.length-1;
    //    while(left<=right){
    //        int mid=left+(right-left)/2;
    //        if(nums[mid]>nums[right]) left=mid+1;    // min exists int the rightside of the mid as mid is already larger than right
    //        else if(nums[mid]<nums[right]) right=mid; // otherwise to the leftside as mid  is smalller than right
    //        else right--; // nums[mid] == nums[right], we can't determine which side, so reduce search space by doiscarding the value at the right
                // because its a duplicate and does not provide any new info to us.
    //    }
    //    return nums[left];
     int min = nums[0];  // Assume first element is the minimum
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];  // Update minimum if a smaller value is found
            }
        }
        return min;
    }
}