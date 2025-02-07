// solved using Moor'es voting algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0;   
        int count=0; //points
        for(int i=0; i<nums.length; i++){

            if(count==0){
                candidate=nums[i];
            }
            if(candidate==nums[i]){
                count++;
            }else{
                count--;
            }

        }
        return candidate;
        
    }
}
