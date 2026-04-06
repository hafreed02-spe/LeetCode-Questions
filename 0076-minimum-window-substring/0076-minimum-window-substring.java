class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:t.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=t.length();
        int left=0;
        int right=0;
        int start=0;
        int min=Integer.MAX_VALUE;
        while(right<n)
        {
            char ch=s.charAt(right);
            if(map.containsKey(ch))
            {
                if(map.get(ch)>0) count--;
                map.put(ch,map.get(ch)-1);
            }
            right++;
            while(count==0)
            {
                if(right-left<min)
                {
                    min=right-left;
                    start=left;
                }
                char ch1=s.charAt(left);
                if(map.containsKey(ch1))
                {
                    map.put(ch1,map.get(ch1)+1);
                    if(map.get(ch1)>0) count++;
                }
                left++;
            }
        }
        return min==Integer.MAX_VALUE?"":s.substring(start,start+min);
    }
}