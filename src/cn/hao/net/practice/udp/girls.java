package cn.hao.net.practice.udp;

import java.net.SocketException;

public class girls {
    public static void main(String[] args) throws SocketException {
        new Thread(new Send(6574,9999,"localhost")).start();
        new Thread(new Receive(9998)).start();
    }
}
