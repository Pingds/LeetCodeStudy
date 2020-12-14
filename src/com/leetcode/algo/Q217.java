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
        int[] numbers =new int[]{-24500,-24499,-24498,-24497,-24496,-24495,-24494,-24493,-24492,-24491,-24490,-24489,-24488,-24487,-24486,-24485,-24484,-24483,-24482,-24481,-24480,-24479,-24478,-24477,-24476,-24475,-24474,-24473,-24472,-24471,-24470,-24469,-24468,-24467,-24466,-24465,-24464,-24463,-24462,-24461,-24460,-24459,-24458,-24457,-24456,-24455,-24454,-24453,-24452,-24451,-24450,-24449,-24448,-24447,-24446,-24445,-24444,-24443,-24442,-24441,-24440,-24439,-24438,-24437,-24436,-24435,-24434,-24433,-24432,-24431,-24430,-24429,-24428,-24427,-24426,-24425,-24424,-24423,-24422,-24421,-24420,-24419,-24418,-24417,-24416,-24415,-24414,-24413,-24412,-24411,-24410,-24409,-24408,-24407,-24406,-24405,-24404,-24403,-24402,-24401,-24400,-24399,-24398,-24397,-24396,-24395,-24394,-24393,-24392,-24391,-24390,-24389,-24388,-24387,-24386,-24385,-24384,-24383,-24382,-24381,-24380,-24379,-24378,-24377,-24376,-24375,-24374,-24373,-24372,-24371,-24370,-24369,-24368,-24367,-24366,-24365,-24364,-24363,-24362,-24361,-24360,-24359,-24358,-24357,-24356,-24355,-24354,-24353,-24352,-24351,-24350,-24349,-24348,-24347,-24346,-24345,-24344,-24343,-24342,-24341,-24340,-24339,-24338,-24337,-24336,-24335,-24334,-24333,-24332,-24331,-24330,-24329,-24328,-24327,-24326,-24325,-24324,-24323,-24322,-24321,-24320,-24319,-24318,-24317,-24316,-24315,-24314};
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
