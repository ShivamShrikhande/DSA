/*
1. Brute Force — Nested Loops
class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > n / 2) {
                return nums[i];
            }
        }

        return -1;
    }
}
*/


class Solution {
    public int majorityElement(int[] nums) {
        int moreappear = nums.length/2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num : nums){
            if(map.get(num)>moreappear){
                return num;
            }
            
        }
        return 0;
    }
}
// class Solution {
//     public int majorityElement(int[] nums) {

//         for (int i = 0; i < nums.length; i++) {

//             int count = 0;

//             for (int j = 0; j < nums.length; j++) {

//                 if (nums[i] == nums[j]) {
//                     count++;
//                 }
//             }

//             if (count > nums.length / 2) {
//                 return nums[i];
//             }
//         }

//         return -1;
//     }
// }