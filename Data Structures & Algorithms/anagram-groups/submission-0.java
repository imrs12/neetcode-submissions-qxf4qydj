class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> res = new HashMap<>();

        for(String s: strs){
            int[] count = new int[26];

            for(char c: s.toCharArray()){
                count[c - 'a']++;
            }

            String Key = Arrays.toString(count);

            res.putIfAbsent(Key, new ArrayList<>());

            res.get(Key).add(s);
        }
        
        return new ArrayList<>(res.values());
    }
}
