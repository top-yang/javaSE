package cn.hao.net.practice.udp;

import java.net.SocketException;
//commit 网络编程
public class boys {
    public static void main(String[] args) throws SocketException {
        new Thread(new Send(9990,9998,"localhost")).start();
        new Thread(new Receive(9999)).start();
    }
}
