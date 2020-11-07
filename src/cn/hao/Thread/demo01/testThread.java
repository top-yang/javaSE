package cn.hao.Thread.demo01;

public class testThread extends Thread{
    @Override
    public void run() {
        for(int j=0;j<100;j++){
            System.out.println("线程I*****:"+j);
        }
    }
}
