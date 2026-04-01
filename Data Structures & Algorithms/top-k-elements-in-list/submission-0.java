class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0)+1);
        }

        List<int[]> freqList = new ArrayList<>();

        for(Map.Entry<Integer,Integer> list : count.entrySet()){
            freqList.add(new int[]{list.getValue(), list.getKey()});
        }

        freqList.sort((a,b)-> b[0]-a[0]);

        int[] res = new int[k];

        for(int i=0; i < k; i++ ){
            res[i] = freqList.get(i)[1];
        }

        return res;
    }
    
}
