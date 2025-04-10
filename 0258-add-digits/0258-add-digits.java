class Solution {
    public int addDigits(int num) {
           if(num == 0) return 0;
        else if(num % 9 != 0) return num%9;
        else return 9;
    }
}
    //    int sum=0;
    //    if(num < 10){
    //        return num;
    //    }
    //   
    //    while(true){
    //        while(num > 0){
    //        sum += num % 10;
    //        num = num / 10;
    //        } 
    //        
    //        if(sum < 10){
    //            break;
    //        }
    //        num = sum;
    //        sum = 0;  
    //    }
    //    return sum;
    