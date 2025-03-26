class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //int m=matrix.length;
        //int n= matrix[0].length;
        //int left=0;
        //int right=m*n-1;
        //while(left<=right){
        //    int mid=left+(right-left)/2;
       //     int row=mid/n;
        //    int colum=mid%n;
//
        //    if(matrix[row][colum]==target) return true;
        //    else if(matrix[row][colum]>target) right=mid-1;
        //    else left=mid+1;
        int col = matrix[0].length-1;
        int row = 0;
        while(col >= 0 && row <= matrix.length-1) {
            if(target == matrix[row][col]) {
                return true;
            } else if(target < matrix[row][col]) {
                col--;
            } else if(target > matrix[row][col]) {
                row++;
            }
    }
        return false;
    }
}