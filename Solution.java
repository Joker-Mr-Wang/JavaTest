package Java_210117;

import java.util.Arrays;
//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
class Solution {
    public static void main(String[] args) {
        int[] num ={1,2};
        int k=2;
          rotate(num,k);
    }



   static void rotate(int[] nums, int k) {
       while (k>0) {
           if (nums.length>k) {
               k = (k % nums.length);
           }
           int tmp = nums[nums.length - 1];
           for (int i = nums.length - 1; i > 0; i--) {
               nums[i] = nums[i - 1];
           }
           nums[0] = tmp;
           k--;
       }
       System.out.println(Arrays.toString(nums));
   }
}