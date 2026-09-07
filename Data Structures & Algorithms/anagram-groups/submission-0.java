class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String key = new String(charArray);

            if(!groups.containsKey(key)){
                groups.put(key, new ArrayList<>());
            }
            groups.get(key).add(str);
        }
        return new ArrayList<>(groups.values());
    }
}

//hash map oluştur, stringleri char arraye dönüştürüp sort yap sonra tekrar string dönüştürüp key yap
//ondan sonra da her elemanı 