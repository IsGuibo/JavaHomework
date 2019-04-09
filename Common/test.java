package com.example.lib.JavaHomework.Common;


public class test {
    public static void main(String[] args) {
        final   String str = "this is a test of java";
        System.out.println(appendCount(str));

    }
    //统计该字符串中字母s出现的次数
    private static int appendCount(String str){
        int count =0;
        char[] chars=str.toCharArray();
        for(char c:chars){
            if(c==115){
                count++;
            }
        }
        return count;
    }
}
