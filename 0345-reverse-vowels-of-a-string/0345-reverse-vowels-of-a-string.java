class Solution {
    public String reverseVowels(String s) {
        List<Character> list=new ArrayList<>();
        for(char ch:s.toCharArray())
        {
            if("aeiouAEIOU".contains(String.valueOf(ch)))
            list.add(ch);
        }   
        Collections.reverse(list);
        String s1="";
        int index=0;
        for(int i=0;i<s.length();i++)
        {
            if("aeiouAEIOU".contains(String.valueOf(s.charAt(i))))
            s1+=list.get(index++);
            else
            s1+=s.charAt(i);
        }
        return s1;
    }
}