package com.example.thread.priority.demo.systematicness;

/**
 * @Author: 无双老师【云析学院:http://yunxiedu.net QQ:3190976240 email:zhouguanya20@163.com】
 * @Date: 2019-05-30
 * @Description:  线程规则性和随机性
 */
public class ThreadPriority {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MyThread1 myThread1 = new MyThread1();
            myThread1.setPriority(1);
            MyThread2 myThread2 = new MyThread2();
            myThread2.setPriority(10);
            myThread1.start();
            myThread2.start();
        }
    }
}
