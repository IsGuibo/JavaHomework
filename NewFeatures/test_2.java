package com.example.lib.JavaHomework.NewFeatures;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

interface MyInterface {
    void display();
}

@interface MyAnnotation {
    String name() default  "";
}

public class test_2 {
    @MyAnnotation(name = "class_1")
    class calss_1 implements MyInterface {
        String TAG = "class_1";
        @Override
        public void display() {
            System.out.println(TAG);
        }
    }
    @MyAnnotation(name = "class_2")
    class calss_2 implements MyInterface {
        String TAG = "class_2";
        @Override
        public void display() {
            System.out.println(TAG);
        }
    }
    public static void main(String[] args) {
        ArrayList<Class> list = ClassUtil.getAllClassByInterface(MyInterface.class);
        String str = new Scanner(System.in).next();
        if(list!=null){
            for (Class tmp : list) {
               if(tmp.isAnnotationPresent(MyAnnotation.class)){
                   MyAnnotation myAnnotation = (MyAnnotation) tmp.getAnnotation(MyAnnotation.class);
                   if(str.equals(myAnnotation.name())){
                       try {
                           Method theMethod =  tmp.getMethod("display", (Class<?>) null);
                           theMethod.invoke(tmp, (Object) null);
                       } catch (NoSuchMethodException e) {
                           e.printStackTrace();
                       } catch (IllegalAccessException e) {
                           e.printStackTrace();
                       } catch (InvocationTargetException e) {
                           e.printStackTrace();
                       }
                   }
               }else
                   break;
            }
        }else {
            System.out.println("NULL");
        }
    }
}