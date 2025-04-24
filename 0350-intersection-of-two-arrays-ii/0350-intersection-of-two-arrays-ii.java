class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       List<Integer> list1 = new ArrayList<>();      //1. Convert Array nums1[] to list1<> and Array nums2[] to list2
      List<Integer> list2 = new ArrayList<>();       //2. Now in list2 add only thoes element which are comman between to list.
        for (int i = 0; i < nums1.length; i++) {
            list1.add(nums1[i]);
        }
        
         for (int i = 0; i < nums2.length; i++) {
            if (list1.contains(nums2[i])) 
                list2.add(nums2[i]);
                list1.remove(Integer.valueOf(nums2[i])); // Remove matched value once
        }
        int s[] = new int[list2.size()];     //3. Create and array s[] so that u can return the array.
        int i = 0;
        for (Integer num : list2) {
            s[i++] = num;
        }
        return s;
    }       
}