class Solution {
    public int minimumPushes(String word) {
        if(word.length() <8){
            return word.length();
        }

        int assign =2;
        Map<Integer,Integer> map = new HashMap<>();
        int count =0;
        for(char ch: word.toCharArray()){
            if(assign > 9){
                assign = 2;
            }
            map.put(assign,map.getOrDefault(assign,0)+1);
            count += map.get(assign);
            assign++;
        }
        return count;
    }
}