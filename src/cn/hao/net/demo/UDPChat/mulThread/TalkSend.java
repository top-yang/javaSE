package cn.hao.net.demo.UDPChat.mulThread;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class TalkSend implements Runnable{
    DatagramSocket datagramSocket=null;
    private int toport;
    private int fromport;
    private String toIp;

    public TalkSend(int toport, int fromport, String toIp) throws SocketException {
        this.datagramSocket = new DatagramSocket(fromport);
        this.toport = toport;
        this.fromport = fromport;
        this.toIp = toIp;
    }

    @Override
    public void run() {

       while (true)
       {
           Scanner scanner=new Scanner(System.in);
           String msg=scanner.next();
           DatagramPacket packet = new DatagramPacket(msg.getBytes(),0,msg.getBytes().length,new InetSocketAddress(this.toIp,this.toport));
           try {
               this.datagramSocket.send(packet);
           } catch (IOException e) {
               e.printStackTrace();
           }


       }

    }
}
