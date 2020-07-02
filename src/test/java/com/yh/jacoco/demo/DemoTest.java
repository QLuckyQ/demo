//package com.yh.jacoco.demo;
//
//import com.yh.jacoco.demo.branch.Branch;
//import com.yh.jacoco.demo.classes.AppleClass;
//import com.yh.jacoco.demo.extend.Sun;
////import com.yh.jacoco.demo.lambda.LambdaUtil;
//import com.yh.jacoco.demo.lambda.User;
//import com.yh.jacoco.demo.thread.Threads;
//import org.assertj.core.util.Lists;
//import org.junit.Test;
//
//import java.util.List;
//
///**
// * @author yanghao
// * @version DemoTest.java, v 0.1 2019-08-08 11:14
// */
//public class DemoTest {
//
//    @Test
//    public void testCounts(){
//
//        Sun sun = new Sun();
//        //给爸爸5个
//        sun.addForParent(5);
//        //给儿子2个
//        sun.add(2);
//
//    }
//
//    @Test
//    public void testThread(){
//
//        Threads thread1 = new Threads(1);
//        Threads thread2 = new Threads(2);
//        Threads thread3 = new Threads(3);
//        Threads thread4 = new Threads(4);
//        Threads thread5 = new Threads(5);
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
//
//    }
//
//    @Test
//    public void testBranch(){
//        Branch branch = new Branch();
//        //branch.getName(1);
//        //branch.getName(2);
//        //branch.getName(3);
//        branch.getName(4);
//
//    }
//
//    @Test
//    public void testClass(){
//        AppleClass appleClass = new AppleClass();
//        appleClass.add(5);
//        appleClass.sub(3);
//    }
//
//    @Test
//    public void testLambda(){
//        //组装list集合
//        List<User> userList = Lists.newArrayList();
//        userList.add(new User("111", "张三"));
//        userList.add(new User("222", "李四"));
//
//        //1.list转map
//        LambdaUtil.listToMap(userList);
//
//        userList.add(new User("111", "王五"));
//        //2.list转map k1
//        LambdaUtil.listToMapForK1(userList);
//        //3.list转map k2
//        LambdaUtil.listToMapForK2(userList);
//        //4.分组
//        LambdaUtil.group(userList);
//        //5.过滤
//        LambdaUtil.filter(userList, "111");
//
//    }
//
//
//
//}
