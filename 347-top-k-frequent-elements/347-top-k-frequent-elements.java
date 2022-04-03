class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> elemCountMap = new HashMap<>();
 
     for(int num : nums) {
        elemCountMap.put(num, elemCountMap.getOrDefault(num, 0)+1);
     }
        
     List<Integer> result = 
               elemCountMap.entrySet().stream()
                           .sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue()))
                           .limit(k)
                           .map(i -> i.getKey())
                           .collect(Collectors.toList());
 
     int[] resultArr = new int[result.size()];
 
     for(int i = 0; i < result.size(); i++) {
           resultArr[i] = result.get(i);
     }
 
     return resultArr;
    }
}