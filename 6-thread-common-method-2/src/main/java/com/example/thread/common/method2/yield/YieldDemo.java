package com.example.thread.common.method2.yield;

/**
 * @Author: 无双老师【云析学院:http://yunxiedu.net QQ:3190976240 email:zhouguanya20@163.com】
 * @Date: 2019-06-09
 * @Description: 分别观察没有调用yield()和调用yield()方法的输出
 */
public class YieldDemo {
    public static void main(String[] args) {
        Thread producer = new Producer();
        Thread consumer = new Consumer();
        // 最低优先级
        producer.setPriority(Thread.MIN_PRIORITY);
        // 最高优先级
        consumer.setPriority(Thread.MAX_PRIORITY);
        consumer.start();
        producer.start();
    }
}
