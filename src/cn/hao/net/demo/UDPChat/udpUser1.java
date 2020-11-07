package cn.hao.net.demo.UDPChat;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author hao
 */
public class udpUser1 extends Thread {
    public static void main(String[] args) throws IOException {
      while (true){
          //建立socket
          DatagramSocket datagramSocket = new DatagramSocket(4400);

          /**
           * 发信息
           */
          //建立数据报
          Scanner scanner=new Scanner(System.in);
          String msg=scanner.next();
          if(msg!=null){
              InetAddress localhost = InetAddress.getByName("localhost");
              int port=4399;
              DatagramPacket datagramPacket1 = new DatagramPacket(msg.getBytes(),0,msg.getBytes().length,localhost,port);
              //发包
              datagramSocket.send(datagramPacket1);
          }






          //关闭相关流
          datagramSocket.close();
      }



    }


}
