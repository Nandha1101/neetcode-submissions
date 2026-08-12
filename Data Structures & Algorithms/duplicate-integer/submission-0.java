class Solution {
    public boolean hasDuplicate(int[] nums) {
        int cnt = 1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
        }
        if(cnt>=2){
            return true;
        }
        return false;
    }
}