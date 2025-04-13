class Solution {
    public boolean isPalindrome(String s) {
        String a=s.replaceAll("[^a-zA-Z0-9]", "");//for removing spaces and non-alphanumeric values
        a=a.toLowerCase();//converted to lower case
        int l=0,r=a.length()-1;
        while(l<r){
            if(a.charAt(l)==a.charAt(r)){//comparing characters from starting and ending
                l++;//if it is same then increase l and decrease r then continue to next iteration
                r--;
                continue;
            }
            else return false;//if not equal simply return false
        }
        return true;
    }
}