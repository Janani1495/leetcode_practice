class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        if(ruleKey.equals("type")){
            for(int i=0;i<items.size();i++){
                String str=items.get(i).get(0);
                if(str.equals(ruleValue)){
                    count++;
                }
            }
        }
        else if(ruleKey.equals("color")){
            for(int i=0;i<items.size();i++){
                String str=items.get(i).get(1);
                if(str.equals(ruleValue)){
                    count++;
                }
            }
        }
        else{
            for(int i=0;i<items.size();i++){
                String str=items.get(i).get(2);
                if(str.equals(ruleValue)){
                    count++;
                }
            }
        }return count;
    }
}