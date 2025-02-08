// solved using Moor'es voting algorithm
//time O(n) because only one for loop
//space O(1) not using any extra space
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
