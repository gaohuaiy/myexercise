package jianzhioffer.day3.code05;
/* 
 * 
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * 
 */
public class test {
    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char charArray : s.toCharArray()) {
            if(charArray == ' '){
                stringBuilder.append("%20");
            }else{
                stringBuilder.append(charArray);
            }
        }
    
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(new test().replaceSpace(s));;
    }
}
