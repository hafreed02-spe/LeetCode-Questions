class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count=0;
        int ans=0;
        for(int i:nums)
        {
            count+=i;
            if(count==0)
            ans++;
        }
        return ans;
    }
}