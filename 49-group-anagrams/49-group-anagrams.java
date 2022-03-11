class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> rst = new ArrayList<List<String>>();
        if (strs == null) {
        	return rst;
        }

		List<String> order = new ArrayList<String>();
		HashMap<String, List<String>> map  = new HashMap<String, List<String>>();
		for (String str : strs) {
		    char[] arr = str.toCharArray();
		    Arrays.sort(arr);
			String s = new String(arr);
			if (!map.containsKey(s)){
				List<String> l = new ArrayList<String>();
				l.add(str);
				order.add(s);
				map.put(s, l);
			} else {
				map.get(s).add(str);
			}
		}
		Collections.sort(order);
		for (String str : order) {
			Collections.sort(map.get(str));
			rst.add(map.get(str));
		}
		return rst;
    }
}