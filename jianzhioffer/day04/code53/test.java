package jianzhioffer.day04.code53;

import java.util.HashMap;

/* 统计一个数字在排序数组中出现的次数。

 

示例 1:

输入: nums = [5,7,7,8,8,10], target = 8
输出: 2
示例 2:

输入: nums = [5,7,7,8,8,10], target = 6
输出: 0
 

提示：

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums 是一个非递减数组
-109 <= target <= 109

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。 */
public class test {

    public int searchLow(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int item : nums) {
            if (map.keySet().contains(item)) {
                Integer temp = map.get(item); 
                map.put(item, temp+1);
            }else{
                map.put(item, 1);
            }
        }
        return map.keySet().contains(target)?map.get(target):0;
    }
    public int search(int[] nums, int target) {

        return 0;
    }

    public static void main(String[] args) {
        int [] a = {5,7,7,8,8,10};
        System.out.println(new test().search(a, 8));
    }
}
