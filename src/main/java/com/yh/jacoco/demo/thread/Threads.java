package com.yh.jacoco.demo.thread;

/**
 * @author yanghao
 * @version Threads.java, v 0.1 2019-08-16 09:05
 */
public class Threads extends Thread {

    private int index = 0;

    public Threads(int index){
        this.index = index;
    }

    @Override
    public void run() {

        try {
            System.out.println("index == " + index);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
