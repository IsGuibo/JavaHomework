package com.example.lib.JavaHomework.Common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test_4 {
    public static void main(String[] args) {
        //检查一个电话号码是否符合(0000)0000-0000
        String str = "(0000)0000-0000";
        String regExp = "\\(\\d{4}\\)\\d{4}-\\d{4}";
        Pattern p = Pattern.compile(regExp);
        System.out.println(p.matcher(str).matches());
        // 将一个字符串中所有的ip地址打印出来
        String parentString="HuangGuibo_IP:127.168.220.221q";
        String regexString=".*(\\d{3}(\\.\\d{1,3}){3}).*";
        System.out.println(parentString.replaceAll(regexString,"$1"));
        //将字符串中连续出现的字符压缩成一个。比如aaabbbccccd，压缩后变成abcd。
        str = "aaabbbccccd";
        System.out.println(str.replaceAll("([a-z])\\1+", "$1"));
        //输入一个字符串，判断该字符串是否以abc结尾
        regExp = ".*abc$";
        p = Pattern.compile(regExp);
        System.out.println(p.matcher(str).matches());
        //将一个字符串中的所有整数提取出来，保存在一维数组中。比如”ae256dd—w348e6”，提取出256,348,6三个整数
        str = "ae256dd—w348e6";
        System.out.println( str.replaceAll("(\\D+)","|"));
        //文本替换：将字符串中所有的”pupel”替换为”pupil”。
        str = "pupel";
        System.out.println(  str.replaceAll("pupel","pupil"));





    }
}
