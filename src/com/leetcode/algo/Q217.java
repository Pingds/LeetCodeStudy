package com.leetcode.algo;

import extensions.leetcode.algo.*;
import java.util.Arrays;

/**
 * @Description: 给定一个整数数组，判断是否存在重复元素。 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 * @Author: Davis
 * @Date: Created in 11:27 2020/12/13
 * @Modified By: Davis
 */
public class Q217 {

    public static void main(String[] args){
        int[] numbers =new int[]{1,2,3,1};
        var result = containsDuplicate(numbers);
        System.out.println("Q217 input:"+ ArrayExtension.ToText(numbers)+", output:"+ result);
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
                return true;
        }
        return false;
    }
}
