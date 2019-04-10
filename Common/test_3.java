package com.example.lib.JavaHomework.Common;

public class test_3 {
//写一个例子，实现包装类与基本数据类型之间转换；实现包装类与字符串相互转换；实现基本数据类型与字符串之间相互转换
    public static void main(String[] args) {
        int num = 1;
        Integer integer = new Integer(num);
        num = integer.intValue();//包装类与基本数据类型之间转换,其他类型操作相似。
        String str = integer.toString();
        Integer integer_2 = new Integer(str);//实现包装类与字符串相互转换；
        str = String.valueOf(num);
        num = Integer.valueOf(str);//实现基本数据类型与字符串之间相互转换
    }
}
