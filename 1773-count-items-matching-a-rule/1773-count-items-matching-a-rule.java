class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int count = 0;
        int setIndex=0;
        
        if(ruleKey.equals("color")){
            setIndex = 1;
        }
        
        else if(ruleKey.equals("name")){
            setIndex = 2;
        }
        
        for(List item: items){
            
            if(item.get(setIndex).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}