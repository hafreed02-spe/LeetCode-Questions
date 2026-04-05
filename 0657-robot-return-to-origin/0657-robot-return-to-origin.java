class Solution {
    public boolean judgeCircle(String moves) {
        int u=0;
        int d=0;
        int l=0;
        int r=0;
        for(char ch:moves.toCharArray())
        {
            if(ch=='U')
            u++;
            else if(ch=='D')
            d++;
            else if(ch=='L')
            l++;
            else 
            r++;
        }
        if(u==d&&l==r)
        return true;
        return false;
    
        

    }
}