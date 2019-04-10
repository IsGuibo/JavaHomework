package com.example.lib.JavaHomework.Common;

public class test_2 {
    //写一个例子，练习String对象与StringBuffer对象互相转换，测试StringBuffer类的添加、插入、删除、反转操作。
    public static void main(String[] args) {
        String string = "hello world!";
        StringBuffer stringBuffer = new StringBuffer(string);
        string = stringBuffer.toString();
        stringBuffer.insert(0, "insert ");
        stringBuffer.delete(0, 6);
        stringBuffer.replace(1, 4, "HELLO");
        stringBuffer.reverse();
    }
}
