class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int max=0;
        int i=0;
        int j=0;
       while(i<n&&j<m)
       {
        if(i<=j)
        {
            if(nums1[i]<=nums2[j])
            {
                max=Math.max(max,Math.abs(i-j));
                j++;
            }
            else
            {
                i++;
            }
        }
        else
        {
            j=i;
        }
       }
        return max;
    }
}