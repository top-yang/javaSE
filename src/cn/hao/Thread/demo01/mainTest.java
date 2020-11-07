package cn.hao.Thread.demo01;

import org.junit.Test;

public class mainTest {
    public static void main(String[] args) {
        testThread1 testThread1 = new testThread1();
        testThread testThread = new testThread();
        testThread.start();
        testThread1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("这是主线程");
        }
    }

    @Test
    public void testrunnable(){



    }

}
