package com.example.lib.JavaHomework.ContainerAndGeneric;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class test_1 {

    public  static void  main(String[] args){
        //使用TreeSet保存学生对象，按测评总分排序。如果分数相同，按姓名排序
        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s_1, Student s_2) {
                if(s_1.getScore()>s_2.getScore()){
                    return -1;
                }else if(s_1.getScore()<s_2.getScore()){
                    return 1;
                } else {
                   return  s_1.getName().compareTo(s_2.getName());
                }
            }
        });
        treeSet.add(new Student(1,"huang",100));
        treeSet.add(new Student(2,"wang",99));
        treeSet.add(new Student(3,"wei",98));
        treeSet.add(new Student(4,"sun",98));
        //用迭代器输出学生对象。
        Iterator iter = treeSet.iterator();
        while (iter.hasNext()) {
                    System.out.println(iter.next());
        }


    }
}
//创建学生类，包含学号、姓名、综合测评总分。
class Student{
    private int id;
    private String name;
    private int score;
    Student(int id,String name,int score){
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return " "+id+" "+name+" "+score;
    }
}
