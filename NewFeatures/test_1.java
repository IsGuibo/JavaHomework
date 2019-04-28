package com.example.lib.JavaHomework.NewFeatures;

import java.util.function.Consumer;

public class test_1 {
    static class Apple{
        String color;
        float weight;
        Apple(String color,float weight){
            this.color = color;
            this.weight = weight;
        }
    }
    public static class  test{
        public static void ConsumerApple(Apple[] apps, Consumer<Apple> c){
            for(Apple app:apps){
                c.accept(app);
            }
        }
        public static void main(String[] args) {
            Apple[] apples = new Apple[2];
            Apple apple = new Apple("red",1);
            apples[0] = apple;
            apple = new Apple("green",2);
            apples[1] = apple;
            //匿名内部类的形式
            ConsumerApple(apples, new Consumer<Apple>() {
                @Override
                public void accept(Apple apple) {

                }
            });
            //用lambda的形式完成参数Consumer<Apple> c的传递
           // ConsumerApple(apples, (Apple aApple) ->{

         //   });



        }
    }


}
