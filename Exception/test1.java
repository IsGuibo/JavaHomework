package com.example.lib.JavaHomework.Exception;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.example.lib.JavaHomework.Exception.Tool.parseInt;

/*
自定义异常类，用来描述数字格式异常。
自定义一个工具类，有一个public static int parseInt(String str)静态方法，
能够将字符串转换为数值并返回，如果在转换过程中发现非数字字符，
则抛出自定义异常对象。最后写一个测试类，调用自定义工具类的parseInt方法，
并进行异常捕获处理。
*/
public class test1 {
    public static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        parseInt(str);
    }
}
class Tool{
    static int parseInt(String str) throws MyException {
        if(!isNumber(str)){
            throw new MyException("不是数字");
        }
        return Integer.parseInt(str);
    }
    private static boolean isNumber(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        return isNum.matches();
    }
}
class MyException extends Exception {

    MyException(String message) {
        super(message);
    }
}
