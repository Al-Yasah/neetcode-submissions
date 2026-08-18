class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean dupe = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num: nums){
            if (!map.containsKey(num)){
                map.put(num,1);
            }else{
                dupe = true;
            }
        }
        System.out.println(dupe);
        return dupe;
    }

    
}