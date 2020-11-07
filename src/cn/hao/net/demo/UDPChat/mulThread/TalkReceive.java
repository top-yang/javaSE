package cn.hao.net.demo.UDPChat.mulThread;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Date;

public class TalkReceive implements Runnable{
    DatagramSocket datagramSocket = null;
    private int port;

    public TalkReceive( int port) throws SocketException {
        this.datagramSocket = new DatagramSocket(port);
        this.port = port;
    }

    @Override
    public void run() {
        while(true) {
            //接收包
            byte[] buffer = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(buffer, 0, buffer.length);
            try {
                datagramSocket.receive(datagramPacket);
            } catch (IOException e) {
                e.printStackTrace();
            }
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
    }
}
