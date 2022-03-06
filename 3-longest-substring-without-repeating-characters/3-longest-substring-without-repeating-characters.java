class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int counter = 0;
        for (int left = 0, right = 0; right < s.length(); right++) {
            
            char cRight = s.charAt(right);
            map.put(cRight, map.getOrDefault(cRight, 0) + 1);
            if (map.get(cRight) > 1) {
                counter++;
            }

            while (counter > 0) {
                char cLeft = s.charAt(left);
                map.put(cLeft, map.get(cLeft) - 1);
                
                if (map.get(cLeft) == 1) {
                    counter--;
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
        
    }
}