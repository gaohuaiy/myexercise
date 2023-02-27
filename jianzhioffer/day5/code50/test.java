package jianzhioffer.day5.code50;
/* 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。

示例 1:

输入：s = "abaccdeff"
输出：'b'
示例 2:

输入：s = "" 
输出：' '
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class test {

    public char firstUniqChar1(String s) {
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Character keySet : map.keySet()) {
            Integer i = map.get(keySet);
            if (i == 1) {
                return keySet;
            }
        }

        return ' ';
    }

    public char firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int n = s.length();

        for (int c = 0; c < n; c++) {
            char ss = s.charAt(c);
            if (hashMap.containsKey(c)) {
                hashMap.put(ss, -1);
            } else {
                hashMap.put(ss, c);
            }
        }
        int first = n;
        char r = ' ';
        for (Entry<Character, Integer> e : hashMap.entrySet()) {
            if (e.getValue() != -1 && e.getValue() < first) {
                first = e.getValue();
            }
        }
        return first == n ? ' ' : s.charAt(first);
    }

    public static void main(String[] args) {
        // System.out.println(new test().firstUniqChar("abaccdeff"));
        System.out.println(new test().firstUniqChar("leetcode"));
    }
}
