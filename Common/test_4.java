package com.example.lib.JavaHomework.Common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test_4 {
    public static void main(String[] args) {
        //检查一个电话号码是否符合(0000)0000-0000
        String str = "(0000)0000-0000";
        String regExp = "\\(\\d{4}\\)\\d{4}-\\d{4}";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        System.out.println(m.matches());
        // 将一个字符串中所有的ip地址打印出来
        String parentString="HuangGuibo_IP:127.168.220.221q";
        String regexString=".*(\\d{3}(\\.\\d{1,3}){3}).*";
        String IPString=parentString.replaceAll(regexString,"$1");
        System.out.println(IPString);
        //将字符串中连续出现的字符压缩成一个。比如aaabbbccccd，压缩后变成abcd。
        String s = "aaabbbccccd";
        s = s.replaceAll("([a-z])\\1+", "$1");
        System.out.println(s);
        //输入一个字符串，判断该字符串是否以abc结尾
        String regExp_2 = ".*abc$";
        Pattern p_2 = Pattern.compile(regExp_2);
        Matcher m_2 = p_2.matcher(str);
        System.out.println(m_2.matches());


    }
}
