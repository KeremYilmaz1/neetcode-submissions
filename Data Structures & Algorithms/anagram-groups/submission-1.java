class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> listMap = new HashMap<>();

        for (String str : strs) {
            char[] strCharArray = str.toCharArray();
            Arrays.sort(strCharArray);
            String key = new String(strCharArray);
            if(listMap.containsKey(key)){
                addElement(listMap.get(key) , str);
            }else{
                List<String> newList = new ArrayList<>();
                listMap.put(key , addElement(newList , str));
            }
        }

        List<List<String>> listsOfAnagrams = new ArrayList<>();

        for (String key : listMap.keySet()) {
            listsOfAnagrams.add(listMap.get(key));
        }

        return listsOfAnagrams;
    }

    private List<String> addElement(List<String> list , String value){
        list.add(value);
        return list;
    }
}