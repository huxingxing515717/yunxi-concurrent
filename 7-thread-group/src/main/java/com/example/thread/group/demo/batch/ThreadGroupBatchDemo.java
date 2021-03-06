package com.example.thread.group.demo.batch;

/**
 * @Author: 无双老师【云析学院:http://yunxiedu.net QQ:3190976240 email:zhouguanya20@163.com】
 * @Date: 2019-06-16 21:22
 * @Description:
 */
public class ThreadGroupBatchDemo {
    public static void main(String[] args) throws InterruptedException {
        int batch = 5;
        ThreadGroup threadGroup = new ThreadGroup("我的线程组");
        for (int i = 0; i < batch; i++) {
            BatchThread batchThread
                    = new BatchThread(threadGroup, "线程" + i);
            batchThread.start();
        }
        Thread.sleep(10000);
        threadGroup.interrupt();
        System.out.println("调用了ThreadGroup.interrupt()方法");
    }
}
