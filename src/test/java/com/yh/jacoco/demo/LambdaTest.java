//package com.yh.jacoco.demo;
//
//import com.yh.jacoco.demo.lambda.User;
//import org.assertj.core.util.Lists;
//import org.junit.Test;
//
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
///**
// * @author yanghao
// * @version LambdaTest.java, v 0.1 2019-08-22 17:19
// */
//public class LambdaTest {
//
//    //@Test
//    public void test(){
//        //组装list集合
//        List<User> userList = Lists.newArrayList();
//        userList.add(new User("111", "张三"));
//        userList.add(new User("222", "李四"));
//
//        //1. list转map
//        Map<String, String> userMap = userList.stream().collect(
//                Collectors.toMap(User::getId, User::getName)
//        );
//
//        System.out.println("userMap === " + userMap);
//
//        /**
//         * 注意：如果存在key值相同的，可以用 (k1,k2)->k1 来设置
//         *      (k1,k2)->k1 如果有重复的key,则保留key1,舍弃key2  --- 保留前者
//         *      (k1,k2)->k2 如果有重复的key,则保留key2,舍弃key1  --- 覆盖前者
//         */
//        userList.add(new User("111", "王五"));
//
//        userMap = userList.stream().collect(
//                Collectors.toMap(User::getId, User::getName, (k1,k2)->k1)
//        );
//        System.out.println("userMap k1 === " + userMap);
//
//        userMap = userList.stream().collect(
//                Collectors.toMap(User::getId, User::getName, (k1,k2)->k2)
//        );
//        System.out.println("userMap k2 === " + userMap);
//
//
//        //2. 分组
//        Map<String, List<User>> userGroupMap = userList.stream().collect(
//                Collectors.groupingBy(User::getId)
//        );
//        System.out.println("userGroupMap === " + userGroupMap);
//
//
//        //3.过滤
//        List<User> userFilterList = userList.stream()
//                .filter(a -> a.getId().equals("111"))
//                .collect(Collectors.toList());
//
//        System.out.println("userFilterList === " + userFilterList);
//
//    }
//
//}
