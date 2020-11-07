package cn.hao.net.demo.UDPChat.mulThread;

import java.net.SocketException;

/**
 * 两个user类分别使用两个进程 user1 发送端口 4321   接收接口 7777   消息目的接口4399
 *                        user2 发送端口 4322   接收接口 4399  消息目的接口7777
 */
public class User1 {
    public static void main(String[] args) throws SocketException {
        new Thread(new TalkSend(4399,4321,"localhost")).start();
        new Thread(new TalkReceive(7777)).start();
    }
}
