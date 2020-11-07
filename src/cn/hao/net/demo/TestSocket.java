package cn.hao.net.demo;

import java.net.InetSocketAddress;

/**
 * @author 86189
 */
public class TestSocket {
    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1",8080);
        System.out.println(inetSocketAddress);
    }
}
