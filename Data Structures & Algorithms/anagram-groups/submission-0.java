class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> groups = new HashMap<>();

        for(String s: strs){
        char[] charArray =  s.toCharArray();
        Arrays.sort(charArray);
        String sortedStrings = new String(charArray);

        groups.putIfAbsent(sortedStrings, new ArrayList<>());
        groups.get(sortedStrings).add(s);

        }

    return new ArrayList<>(groups.values());


    }
}
