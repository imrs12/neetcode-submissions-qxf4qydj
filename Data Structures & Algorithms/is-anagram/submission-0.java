class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> string1 = new HashMap<>();
        HashMap<Character, Integer> string2 = new HashMap<>();

        for( char item: s.toCharArray()){
            if(string1.containsKey(item)){
                int value = string1.get(item);
                string1.put(item, value+1);
            } else {
                string1.put(item, 1);
            }
        }

        for(char item: t.toCharArray()){
            if(string2.containsKey(item)){
                int value = string2.get(item);
                string2.put(item, value+1);
            }else{
                string2.put(item, 1);
            }
        }

        return string1.equals(string2);
    }
}
