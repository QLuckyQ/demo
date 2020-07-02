package com.yh.jacoco.demo.extend;

/**
 * @version Parent.java, v 0.1 2019-08-08 11:03
 */
public abstract class Parent {

    /**
     * 父亲数量
     */
    private int parentCount = 0;

    /**
     * 总数
     */
    protected int counts;

    /**
     * 父亲添加
     * @param index
     */
    public void addForParent(int index){
        this.parentCount += index;
        this.counts += index;

        System.out.println("父亲数量 == " + parentCount);
        System.out.println("总数 == " + counts);
    }

    /**
     * 孩子添加
     * @param index
     */
    protected abstract void add(int index);

}
