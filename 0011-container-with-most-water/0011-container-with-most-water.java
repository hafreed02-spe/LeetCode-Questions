class Solution {
    public int maxArea(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            int val=Math.min(nums[i],nums[j]);
            max=Math.max(max,val*(j-i));
            if(nums[i]<nums[j])
            i++;
            else
            j--;
        }
        return max;
    }
}