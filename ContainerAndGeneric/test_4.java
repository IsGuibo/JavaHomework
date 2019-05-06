package com.example.lib.JavaHomework.ContainerAndGeneric;

import java.util.LinkedList;

public class test_4 {
    public static void main(String[] args) {
        Queue<Integer>queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack);
        System.out.println("取出："+stack.pop()+"  当前栈堆："+stack);
    }
}
//自定义队列
class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();
    public void add(T t){
        list.addFirst(t);
    }
    public void remove(){
        list.removeLast();
    }
    public boolean isNull(){
        return list.isEmpty();
    }
    @Override
    public String toString() {
        return list.toString();
    }
}
//自定义堆栈类
class Stack<T> {
    private  LinkedList<T> list = new LinkedList<T>();
    // push存入元素
    public void push(T t) {
        list.addFirst(t);
    }
    // pop取出元素
    public T pop() {
        T t = list.getFirst();
        list.removeFirst();
        return t;
    }
    public boolean isNull(){
        return list.isEmpty();
    }
    @Override
    public String toString() {
        return list.toString();
    }

}
