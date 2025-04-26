class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] sorted = Arrays.copyOf(score, score.length);
        Arrays.sort(sorted);
        reverseArray(sorted);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<score.length;i++){
            hm.put(score[i],i);
        }
        String[] ans = new String[score.length];
        for(int i=0;i<sorted.length;i++){
            if(i == 0){
                ans[hm.get(sorted[i])] = "Gold Medal";
            }else if(i == 1){
                ans[hm.get(sorted[i])] = "Silver Medal";
            }else if(i == 2){
                ans[hm.get(sorted[i])] = "Bronze Medal";
            }else{
                ans[hm.get(sorted[i])] = ""+(i+1);
            }
        }
        return ans;
    }
    private void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}