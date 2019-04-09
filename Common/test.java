package com.example.lib.JavaHomework.Common;


public class test {
    public static void main(String[] args) {
        final   String str = "this is a test of java";
        System.out.println(appendCount(str));
        System.out.println(str.substring(10,14));//取出子字符串"test"
        InitialCapitalization(str);
    }
    //统计该字符串中字母s出现的次数
    private static int appendCount(String str){
        int count =0;
        char[] chars=str.toCharArray();//将本字符串复制到一个字符数组Char[] str中.// toCharArray

        for(char c:chars){
            if(c==115){
                count++;
            }
        }
        return count;
    }
    //将字符串中每个单词的第一个字母变成大写， 输出到控制台。//用正则表达式
    private static  void  InitialCapitalization(String str){
        String[] b =str.split("\\s+");
        StringBuffer sb =new StringBuffer();
        for (String aB : b) {
            sb.append(String.valueOf(aB.charAt(0)).toUpperCase()).append(aB.substring(1)).append(" ");
        }
        System.out.println(sb);
    }

}
