package cn.hao.net.practice.udp;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Date;

public class Receive implements Runnable{
    private int port;
    DatagramSocket datagramSocket=null;

    public Receive(int port) throws SocketException {
        this.port = port;
        this.datagramSocket=new DatagramSocket(port);
    }

    @Override
    public void run() {
        while (true){
            byte[]bytes=new byte[1024];
            DatagramPacket datagramPacket=new DatagramPacket(bytes,0,bytes.length);

            try {
                this.datagramSocket.receive(datagramPacket);
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] data=datagramPacket.getData();

            Date date=new Date();
            System.out.println(date.toString());
            System.out.println(new String(data,0,data.length));


        }
    }
}
