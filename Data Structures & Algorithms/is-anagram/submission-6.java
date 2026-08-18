class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();

        for (char ch : s.toCharArray()){
            if (!smap.containsKey(ch)){
                smap.put(ch,1);
            }else{
                int count = smap.get(ch);
                smap.put(ch,count+1);
            }
        }
        for (char ch : t.toCharArray()){
            if (!tmap.containsKey(ch)){
                tmap.put(ch,1);
            }else{
                int count = tmap.get(ch);
                tmap.put(ch,count+1);
            }
        }

        if (smap.size() == tmap.size()){
            for (Map.Entry<Character,Integer> entry : smap.entrySet()){
                char key = entry.getKey();
                if (!Objects.equals(entry.getValue(), tmap.get(key))){
                    return false;
                }
            } 
            return true;
        }else{
            return false;
        }

    }
}
