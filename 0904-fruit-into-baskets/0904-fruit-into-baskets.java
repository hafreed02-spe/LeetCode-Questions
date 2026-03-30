class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        Map<Integer,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int max=-1;
        while(j<n)
        {
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            while(map.size()>2)
            {
                int freq=map.get(fruits[i])-1;
                if(freq==0)
                map.remove(fruits[i]);
                else 
                map.put(fruits[i],freq);
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}