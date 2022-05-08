class Solution {
    public String frequencySort(String s) {
    char[] arr = s.toCharArray();

    int[] count = new int[256];
    for(char c : arr) count[c]++;

    Map<Integer, List<Character>> map = new HashMap<>();
    for(int i = 0; i < 256; i++){
        if(count[i] == 0) continue;
        int cnt = count[i];
        if(!map.containsKey(cnt)){
            map.put(cnt, new ArrayList<Character>());
        }
        map.get(cnt).add((char)i);
    }
        
    StringBuilder sb = new StringBuilder();
    for(int cnt = arr.length; cnt > 0; cnt--){
        
        if(!map.containsKey(cnt)) continue;
        
        List<Character> list = map.get(cnt);
        
        for(Character c: list){
            for(int i = 0; i < cnt; i++){
                sb.append(c);
            }
        }
    }
    return sb.toString();
    }
}