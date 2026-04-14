class Solution {
     private boolean check(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        int count=0;
        while(i<j)
        {
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1!=ch2)
            {
                count++;
                if(count>1)
                return false;
                if(check(s,i+1,j)||check(s,i,j-1))
                return true;
                else if(ch2==s.charAt(i+1))
                return false;
                
            }
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
}