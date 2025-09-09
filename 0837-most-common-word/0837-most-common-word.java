

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
       
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        
        
        String[] arr = paragraph.toLowerCase().split("\\W+");
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String s : arr) {
            if (s.length() == 0) continue;  
            if (!bannedSet.contains(s)) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        
        int max = 0;
        String ans = "";
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        
        return ans;
    }
}
