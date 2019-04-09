package com.example.lib.JavaHomework.Common;


public class test {
    public static void main(String[] args) {
        final   String str = "this is a test of java";
        System.out.println(appendCount(str));
        System.out.println(str.substring(10,14));//取出子字符串"test"



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

}
