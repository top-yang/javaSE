package cn.hao.Thread.demo01;

public class testThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("线程II*************:"+i);
        }
    }
}
