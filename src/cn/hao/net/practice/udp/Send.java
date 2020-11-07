package cn.hao.net.practice.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Date;
import java.util.Scanner;

public class Send implements Runnable {
    //自己的端口号
    private int fromport;
    //发送消息目的地的端口号
    private int toport;
    //发送消息的目的ip
    private String ip;
   DatagramSocket datagramSocket=null;

    public Send(int fromport, int toport, String ip) throws SocketException {
        this.fromport = fromport;
        this.toport = toport;
        this.ip = ip;
        this.datagramSocket=new DatagramSocket(fromport);
    }

    @Override
    public void run() {
        while (true){
            Scanner scanner=new Scanner(System.in);
            String s=scanner.nextLine();
            DatagramPacket packet=new DatagramPacket(s.getBytes(),0,s.getBytes().length,new InetSocketAddress(this.ip,this.toport));
            try {
                Date date=new Date();
                System.out.println(date.toString());
                System.out.println(s);
                this.datagramSocket.send(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
