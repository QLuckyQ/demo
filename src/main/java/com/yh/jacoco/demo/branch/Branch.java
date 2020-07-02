package com.yh.jacoco.demo.branch;

/*
 * @version Branch.java, v 0.1 2019-08-16 09:30
 */
public class Branch {

    public void getName(int index){

        String name = "";

        switch (index){
            case 1:
                name = "1号张三";
                break;
            case 2:
                name = "2号李四";
                break;
            case 3:
                name = "3号老王";
                break;
            default:
                name = "老板";

        }

        System.out.println("name == " + name);

    }

}
