//package com.yh.jacoco.demo.lambda;
//
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
///**
// * @version LambdaUtil.java, v 0.1 2019-09-04 15:34
// */
//public class LambdaUtil {
//
//    /**
//     * list转map
//     */
//    public static void listToMap(List<User> userList){
//        Map<String, String> userMap = userList.stream().collect(
//                Collectors.toMap(User::getId, User::getName)
//        );
//
//        System.out.println("list转map === " + userMap);
//    }
//
//    /**
//     * list转map k1
//     */
//    public static void listToMapForK1(List<User> userList){
//        /**
//         * 注意：如果存在key值相同的，可以用 (k1,k2)->k1 来设置
//         *      (k1,k2)->k1 如果有重复的key,则保留key1,舍弃key2  --- 保留前者
//         *      (k1,k2)->k2 如果有重复的key,则保留key2,舍弃key1  --- 覆盖前者
//         */
//        Map<String, String> userMap = userList.stream().collect(
//                Collectors.toMap(User::getId, User::getName, (k1,k2)->k1)
//        );
//        System.out.println("list转map k1 === " + userMap);
//    }
//
//    /**
//     * list转map k2
//     */
//    public static void listToMapForK2(List<User> userList){
//        /**
//         * 注意：如果存在key值相同的，可以用 (k1,k2)->k1 来设置
//         *      (k1,k2)->k1 如果有重复的key,则保留key1,舍弃key2  --- 保留前者
//         *      (k1,k2)->k2 如果有重复的key,则保留key2,舍弃key1  --- 覆盖前者
//         */
//        Map<String, String> userMap = userList.stream().collect(
//                Collectors.toMap(User::getId, User::getName, (k1,k2)->k2)
//        );
//        System.out.println("list转map k2 === " + userMap);
//    }
//
//    /**
//     * 分组
//     * @param userList
//     */
//    public static void group(List<User> userList){
//        Map<String, List<User>> userGroupMap = userList.stream().collect(
//                Collectors.groupingBy(User::getId)
//        );
//        System.out.println("分组 === " + userGroupMap);
//    }
//
//    /**
//     * 过滤
//     * @param userList
//     * @param id 需要过滤的id
//     */
//    public static void filter(List<User> userList, String id){
//        List<User> userFilterList = userList.stream()
//                .filter(a -> a.getId().equals(id))
//                .collect(Collectors.toList());
//
//        System.out.println("过滤 === " + userFilterList);
//    }
//
//}
