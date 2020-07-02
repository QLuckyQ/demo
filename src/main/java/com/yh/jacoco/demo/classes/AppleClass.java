package com.yh.jacoco.demo.classes;

/**
 * @version AppleClass.java, v 0.1 2019-08-16 09:46
 */
public class AppleClass {

    class Apple{
        int counts;

        public void add(int index){
            counts += index;
            System.out.println("添加了🍎，剩余：" + counts);
        }

        public void sub(int index){
            counts = counts - index;
            System.out.println("减掉了🍎，剩余：" + counts);
        }

    }

    Apple apple = new Apple();

    public void add(int index){
        apple.add(index);
    }

    public void sub(int index){
        apple.sub(index);
    }


}
