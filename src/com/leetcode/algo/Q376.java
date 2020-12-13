package com.leetcode.algo;

/**
 * @Description:
 * @Author: Davis
 * @Date: Created in 23:29 2020/12/12
 * @Modified By: Davis
 */
public class Q376 {
    public static void main(String[] args){
        int[] numbers =new int[]{0,0};
        int result = wiggleMaxLength(numbers);
        System.out.println("result:"+ result);
    }

    public static int wiggleMaxLength(int[] nums) {
        int down=1,up=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1])
                up=down+1;
            else if(nums[i]<nums[i-1])
                down=up+1;
        }

        return nums.length==0?0:Math.max(up,down);
    }
}
