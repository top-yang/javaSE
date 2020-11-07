package cn.hao.net.demo.UDPChat.mulThread;

import java.net.SocketException;

public class User2 {
    public static void main(String[] args) throws SocketException {
        new Thread(new TalkSend(7777,4322,"localhost")).start();
        new Thread(new TalkReceive(4399)).start();
    }
}
