package jianzhioffer.day3.code58;
/* 
字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
请定义一个函数实现字符串左旋转操作的功能。
比如，输入字符串"abcdefg"和数字2，
该函数将返回左旋转两位得到的结果"cdefgab"。

 

示例 1：

输入: s = "abcdefg", k = 2
输出: "cdefgab"
示例 2：

输入: s = "lrloseumgh", k = 6
输出: "umghlrlose"
 */

public class test {

    public String reverseLeftWordsLow(String s, int n) {
        StringBuilder newStr1 =new  StringBuilder();
        StringBuilder newStr2 =new  StringBuilder();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length;++ i) {
            if(i<n){
                newStr2.append(charArray[i]);
            }else{
                newStr1.append(charArray[i]);
            }
        }
        return newStr1.append(newStr2).toString();
    }

    public String reverseLeftWords(String s, int n) {

        return  s.substring(n, s.length()) + s.substring(0,n);
    }


    public static void main(String[] args) {
        System.out.println(new test().reverseLeftWords("abcdefg", 2));;
    }
}
