package com.example.lib.JavaHomework.Common;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class test_5 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个日期(格式：yyyy-MM-dd（年月日))：");
        String Date = input.next();
        input.close();
        int year = Integer.valueOf(Date.substring(0, 4));
        int month = Integer.valueOf(Date.substring(5, 7));
        int dayOfMonth = Integer.valueOf(Date.substring(8));
        LocalDate localDate = LocalDate.of(year, month, dayOfMonth);
        System.out.println("更改后的时间：");
        System.out.println(localDate.plusDays(7).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println("短的日期时间格式：" + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT)));
        System.out.println("中等的日期时间格式：" + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM)));
        System.out.println("长的日期时间格式：" + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.LONG)));
        System.out.println("完整的日期格式：" + localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println("完整的日期时间格式：" + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.LONG)));
        System.out.println("修改年份：" + localDateTime.plusYears(3));
        System.out.println("修改月份：" + localDateTime.plusMonths(3));
        System.out.println("修改天数：" + localDateTime.plusDays(3));
        System.out.println("修改小时：" + localDateTime.plusHours(3));

    }


}