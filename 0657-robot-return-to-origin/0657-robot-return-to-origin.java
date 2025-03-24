class Solution {
    public boolean judgeCircle(String moves) {
        int updown=0, rightleft=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U') updown++;
            else if(ch=='D') updown--;
            else if(ch=='L') rightleft++;
            else if(ch=='R') rightleft--;
        }
        return (updown==0 && rightleft==0);
    }
}