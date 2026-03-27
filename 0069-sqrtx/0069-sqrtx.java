class Solution {
    public int mySqrt(int x) {
        if(x==0||x==1)
        return x;
        int i=0;
        int j=x;
        while(i<=j)
        {
        int  mid=i+(j-i)/2;
            if((long)mid*mid==x)
            return mid;
            else if((long)mid*mid>(long)x)
            j=mid-1;
            else 
            i=mid+1;
        }
        return Math.round(j);
    }
}