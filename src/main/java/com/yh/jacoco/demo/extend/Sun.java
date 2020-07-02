package com.yh.jacoco.demo.extend;

/*
 * @version Sun.java, v 0.1 2019-08-08 11:11
 */
public class Sun extends Parent {

    /**
     * 儿子数量
     */
    private int sunCount = 0;

    /**
     * 添加
     *
     * @param index
     */
    @Override
    public void add(int index) {
        this.sunCount += index;
        this.counts += index;

        System.out.println("儿子数量 == " + sunCount);
        System.out.println("总数 == " + counts);
    }

}
