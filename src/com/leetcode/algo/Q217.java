package com.leetcode.algo;

import extensions.leetcode.algo.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 给定一个整数数组，判断是否存在重复元素。 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 * @Author: Davis
 * @Date: Created in 11:27 2020/12/13
 * @Modified By: Davis
 */
public class Q217 {

    public static void main(String[] args){
        int[] numbers =new int[]{1,2,3,1};
        long beginTime = System.nanoTime();
        var result = containsDuplicate(numbers);
        long endTime = System.nanoTime();

        long beginTime1 = System.nanoTime();
        result = containsDuplicate2(numbers);
        long endTime1 = System.nanoTime();

        long costTimeUs = (endTime-beginTime)/1000;
        long costTimeUs1 = (endTime1-beginTime1)/1000;
        String outPut = "Q217 input:" + ArrayExtension.ToText(numbers) + ",\r\n" +
                "output: " + result + ",\r\n" +
                "method1 cost:" + costTimeUs + "us,\r\n" +
                "method2 cost:" + costTimeUs1 + "us,\r\n";
        System.out.println(outPut);
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
                return true;
        }
        return false;
    }


    public static boolean containsDuplicate2(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int num: nums){
            if(!hs.add(num)) return  true;
        }
        return false;
    }

}
