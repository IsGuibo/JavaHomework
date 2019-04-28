package com.example.lib.JavaHomework.Exception;
import java.util.Scanner;
/*
自定义异常类，用来描述数字格式异常。
自定义一个工具类，有一个public static int parseInt(String str)静态方法，
能够将字符串转换为数值并返回，如果在转换过程中发现非数字字符，
则抛出自定义异常对象。最后写一个测试类，调用自定义工具类的parseInt方法，
并进行异常捕获处理。
*/
public class test1 {
    static class  Exception {
        static int parseInt(String str) throws NumberFormatException {

                return Integer.parseInt(str);
        }
    }
    public static void main(String[] args) {
        try{
            System.out.println(Exception.parseInt(new Scanner(System.in).next()));
        }catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}
