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
    }
}
