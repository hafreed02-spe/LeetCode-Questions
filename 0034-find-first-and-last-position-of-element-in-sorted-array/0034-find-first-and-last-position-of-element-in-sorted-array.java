class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        int ans1=-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(nums[mid]==target)
            {
                ans1=mid;
                j=mid-1;
            }
            else if(nums[mid]<target)
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
        }
       
        int ii=0;
        int jj=n-1;
        int ans2=-1;
        while(ii<=jj)
        {
            int mid=ii+(jj-ii)/2;
            if(nums[mid]==target)
            {
                ans2=mid;
                ii=mid+1;
            }
            else if(nums[mid]<target)
            {
                ii=mid+1;
            }
            else
            {
                jj=mid-1;
            }
        }
        
        return new int[]{ans1,ans2};

    }
}