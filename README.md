# JavaHomework
[TOC]
## 航班管理
java第一次作业

https://github.com/IsGuibo/JavaHomework/tree/master/Passenger

## 常用类
### 1. 编程. 已知字符串："this is a test of java". 
   按要求执行以下操作：
   (1) 统计该字符串中字母s出现的次数
   (2) 取出子字符串"test"  //substring
   (3) 将本字符串复制到一个字符数组Char[] str中.// toCharArray
   (4) 将字符串中每个单词的第一个字母变成大写， 输出到控制台。//用正则表达式
   (5) 用两种方式实现该字符串的倒序输出。(用StringBuffer和for循环方式分别实现)
   (6) 将本字符串转换成一个字符串数组，要求每个数组元素都是一个有意义的英文单词,并输出到控制台
### 2. 写一个例子，
练习String对象与StringBuffer对象互相转换，测试StringBuffer类的添加、插入、删除、反转操作。
### 3. 写一个例子，
实现包装类与基本数据类型之间转换；实现包装类与字符串相互转换；实现基本数据类型与字符串之间相互转换
### 4. 正则表达式
以下每一个小题，都写一小段程序实现，每一小题提交一次git。
（1）检查一个电话号码是否符合(0000)0000-0000
（2）将一个字符串中所有的ip地址打印出来
（3）将字符串中连续出现的字符压缩成一个。比如aaabbbccccd，压缩后变成abcd。
（4）将连续出现的abc用一个abc代替。---选做
（5）从控制台输入邮箱地址，验证是否为邮箱地址。从JOptionPane中输入邮箱地址，验证是否是合法的邮箱。----选做
（6）输入一个字符串，判断该字符串是否以abc结尾。
（7）截取http://地址。在一个网页的源文件中提取静态的http地址。------选做
（8）将一个字符串中的所有整数提取出来，保存在一维数组中。比如”ae256dd—w348e6”，提取出256,348,6三个整数
（9）文本替换：将字符串中所有的”pupel”替换为”pupil”。
（10）从一个字符串中提取以%cxll=开头，右部是%的字符串（不包含%）。
字符串为：
```
"%...%CXLL=add1,31,123.12%CXLL=add2,32,124%CXLL=,33,125.12%LL=-121.11"
```
### 5.日期类。
从控制台输入一个yyyy-MM-dd（年月日）格式的日期字符串，再将这个日期加上七天，再用FormatStyle.MEDIUM格式输出这个日期。
使用java8的日期时间包获取当前系统时间，并以各种格式加以显示
使用java8的日期时间包获取当前系统时间，并修改这个时间（分别修改年份、月份、天、小时），然后打印结果
### 6. 使用随机数生成十个整数（0--99）保存在一个数组中
然后使用数组实用类，将数组元素复制到另外一个数组；将数组元素进行排序；输入一个数值，再查找该数在数组中哪个位置

https://github.com/IsGuibo/JavaHomework/tree/master/Common

## 异常处理
### 1.自定义异常类，用来描述数字格式异常。
自定义一个工具类，有一个public static int parseInt(String str)静态方法，能够将字符串转换为数值并返回，如果在转换过程中发现非数字字符，则抛出自定义异常对象。最后写一个测试类，调用自定义工具类的parseInt方法，并进行异常捕获处理。

https://github.com/IsGuibo/JavaHomework/tree/master/Exception

## 新特性
1.lambda表达式
Consumer是java8提供的函数式接口，其原型为
```
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
    default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }
}
```
定义一个苹果类，有颜色和重量。
定义一个测试类，里面有一个消费苹果的方法。如下
```
public static void ConsumerApple(Apple[] apps,Consumer<Apple> c){
		 for(Apple app:apps){
			 c.accept(app);
		 }
}
```
完成测试类的main方法。main方法创建数个苹果对象放在苹果数组里，再调用ConsumerApple方法。
调用两次，一次用lambda的形式完成参数Consumer<Apple> c的传递。
第二次用匿名内部类的形式。
参考例题6.10
2.利用反射机制和注解根据输入的字符串找到对应的类，并调用其方法。
----对java web servlet的简单模拟。
----本题选做。
 
设计一个接口，有一个方法，功能任意，再设计数个实现该接口的类，给每个实现类加上注解，注解类型是自定义的，拥有一个叫做名称的属性。
利用反射机制找到接口的实现类，再找到注解名称同用户输入的字符串相同的类，然后调用接口定义的方法。

https://github.com/IsGuibo/JavaHomework/tree/master/NewFeatures

## 容器与泛型
### 1.创建学生类，包含学号、姓名、综合测评总分。
使用TreeSet保存学生对象，按测评总分排序。如果分数相同，按姓名排序。 最后再用迭代器输出学生对象。
### 2.每一个学生都有对应的归属地。
??学生Student，地址String。??学生属性：姓名，年龄。?注意：姓名和年龄相同的视为同一个学生。?保证学生的唯一性。定义map容器，将学生作为键，地址作为值存入map。分别使用keySet与entrySet遍历map中元素
### 3.写一个统计投票程序。
设有3个候选人，有10人参加选举，每个选举人输入两个候选人的编号，要求输出各个候选人的得票数。
输入描述：输入10个选举人提交的候选人编号
输出描述：输出候选人编号及对应的得票。*
要求，用map来表示投票结果。
### 4.使用LinkedList分别实现队列、堆栈(自定义队列、堆栈类，封装LinkedList类)。
### 5.创建学生类，包含学号、姓名、综合测评总分，使用ArrayList保存学生对象。
先对学生对象按综合测评总分升序排列，再使用Iterator的next方法输出List中的元素。再按学生的学号从小到大排序，使用Iterator的forEachRemaining方法输出
--提示，将学生类实现Comparable接口，按学号排序采用自然排序。按综测排序，采用指定比较器排序。
### 6.HashSet是如何检测是否有重复元素的，并写程序验证
### 7. 排序类设计---本题选做
定义一个MyTool类，定义两个sort重载的静态方法，不要调用api，可以对对象数组做排序。其中一个sort实现自然排序，另外一个通过指定比较器排序。这两个方法都是泛型方法（只要泛型方法的泛型规则设计好了，在测试类中使用自然排序方法的时候，对不符合自然排序的类数组，就会在编译阶段报错）。
定义两个类（比如学生和老师），其中一个类实现Comparable接口，另外一个类没有实现这个接口。
在测试类创建两个数组，分别保存两个类的对象。对实现Comparable接口创建的对象数组，使用自然排序，普通类的对象数组，通过指定比较器方法排序。

https://github.com/IsGuibo/JavaHomework/tree/master/ContainerAndGeneric
