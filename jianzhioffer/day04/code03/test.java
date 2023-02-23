package jianzhioffer.day04.code03;
/* 找出数组中重复的数字。


在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

示例 1：

输入：
[2, 3, 1, 0, 2, 5, 3]
输出：2 或 3  */

import java.util.HashMap;
import java.util.HashSet;

public class test {
    public int findRepeatNumberFirst(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int item : nums) {
            if(null == map.get(item)){
                map.put(item, item);
            }else{
                return item;
            }
            
        }

        return 0;
    }
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int item : nums) {
            if(set.contains(item)){
                return item;
            }
            set.add(item);
        }

        return -1;
    }
    public static void main(String[] args) {
        int [] a = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(new test().findRepeatNumber(a));
    }
}
