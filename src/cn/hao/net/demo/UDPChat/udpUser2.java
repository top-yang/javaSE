package cn.hao.net.demo.UDPChat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

public class udpUser2 {
    public static void main(String[] args) throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket(4399);
        while(true) {
            //接收包
            byte[] buffer = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(buffer, 0, buffer.length);
            datagramSocket.receive(datagramPacket);
            //接收包中数据
            byte[]data=datagramPacket.getData();

            String receiveData=new String(data,0,data.length);
            Date date = new Date();
            System.out.println(datagramPacket.getPort()+"---"+date.toString() );
            System.out.println(receiveData);
            if(receiveData.equals("bye")){
                break;
            }
        }




            //发信息
            Scanner scanner=new Scanner(System.in);
            String msg=scanner.next();
            if(msg!=null){
                InetAddress localhost = InetAddress.getByName("localhost");
                int port=4400;
                DatagramPacket datagramPacket1 = new DatagramPacket(msg.getBytes(),0,msg.getBytes().length,localhost,port);
                datagramSocket.send(datagramPacket1);
            }



            datagramSocket.close();



    }

}
