/*350. Intersection of Two Arrays II
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
  */

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int num : nums1){
             map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : nums2){
            if(map.containsKey(num) && map.get(num) > 0){
                res.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int arr[] = new int [res.size()];
        for(int i = 0;i<res.size();i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }
}
