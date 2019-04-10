package com.example.lib.JavaHomework.Common;


public class test_1 {
    public static void main(String[] args) {
        final String str = "this is a test_1 of java";
        System.out.println(appendCount(str));
        System.out.println(str.substring(10, 14));//取出子字符串"test_1"
        InitialCapitalization(str);
// 用两种方式实现该字符串的倒序输出。(用StringBuffer和for循环方式分别实现)
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=str.length()-1;i>=0;i--){
            stringBuffer.append(str.charAt(i));
        }
        System.out.println(sb.toString());

        //将本字符串转换成一个字符串数组，要求每个数组元素都是一个有意义的英文单词,并输出到控制台
        String[] b = str.split("\\s+");
        for(String s:b){
            System.out.print(s+"|");
        }
    }

    //统计该字符串中字母s出现的次数
    private static int appendCount(String str) {
        int count = 0;
        char[] chars = str.toCharArray();//将本字符串复制到一个字符数组Char[] str中.// toCharArray

        for (char c : chars) {
            if (c == 115) {
                count++;
            }
        }
        return count;
    }

    //将字符串中每个单词的第一个字母变成大写， 输出到控制台。//用正则表达式
    private static void InitialCapitalization(String str) {
        String[] b = str.split("\\s+");
        StringBuffer sb = new StringBuffer();
        for (String aB : b) {
            sb.append(String.valueOf(aB.charAt(0)).toUpperCase()).append(aB.substring(1)).append(" ");
        }
        System.out.println(sb);
    }

}
