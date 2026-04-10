class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) >= 3) {
                count++;
                break;
            }
        }
        if (count == 0) {
            return -1;
        } else {
            int min = Integer.MAX_VALUE;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int c = 0;
                int one = -1;
                int two = -1;
                int three = -1;
                if (entry.getValue() >= 3) {
                    for (int i = 0; i < nums.length; i++) {
                        if (nums[i] == entry.getKey()) {
                            c++;
                            if (c == 1) one = i;
        else if (c == 2) two = i;
        else if (c == 3) {
            three = i;

            int x = Math.abs(one - two)
                  + Math.abs(two - three)
                  + Math.abs(three - one);

            min = Math.min(min, x);

           
            one = two;
            two = three;
            c = 2;  }
                        }

                    }
                    
                }
            }
            return min;
        }
    }
}