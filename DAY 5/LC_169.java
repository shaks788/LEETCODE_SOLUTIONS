class Solution {
    public int majorityElement(int[] nums) {
        int val=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
                if(count>maxCount){
                    maxCount=count;
                    val=nums[i];
                }
            }
            if(maxCount>(nums.length)/2) return val;    
        }
        return nums.length==1?nums[0]:val;
    }
}
