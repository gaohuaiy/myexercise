package jianzhioffer.day04.code53_2;

/* 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。

 

示例 1:

输入: [0,1,3]
输出: 2
示例 2:

输入: [0,1,2,3,4,5,6,7,9]
输出: 8

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/que-shi-de-shu-zi-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。 */
public class test {

    public int missingNumber(int[] nums) {

        int ArraySum = 0;
        int n = nums.length + 1;
        int sum = n*(n-1)/2;

        for (int i = 0; i < n - 1; i++) {
            ArraySum += nums[i];
        }

        return sum - ArraySum;
        

        
/*         var x, i, l;
        x = document.getElementsByTagName("pre")

        l = x.length;
        for (i = 0; i < l; i++) {
            x[i].style.display="none"
        } */

    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 3, 4, 6 };

        System.out.println(new test().missingNumber(nums));
    }
}
