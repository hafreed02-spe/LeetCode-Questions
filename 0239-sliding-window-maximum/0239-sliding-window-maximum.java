class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] arr=new int[n-k+1];
        int i=0;
        int j=0;
        int index=0;
        int max=Integer.MIN_VALUE;
        while(j<n)
        {
            max=Math.max(max,nums[j]);
            if(j-i+1==k)
            {
            arr[index++]=max;
            i++;
            }
            j++;
        }
        return arr;
    }
}