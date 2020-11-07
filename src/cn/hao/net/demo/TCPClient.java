package cn.hao.net.demo;

import org.junit.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
   @Test
    public void clientEngine(){
       /**
        * 确定服务器地址
        */
       InetAddress inetAddress=null;
       Socket socket=null;
       OutputStream outputStream=null;
       {
           try {
               inetAddress = InetAddress.getByName("127.0.0.1");
               int port=9999;
               socket=new Socket(inetAddress,port);

               //发送消息
               outputStream=socket.getOutputStream();
               outputStream.write("tcp client message".getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }finally {
               if(socket!=null){
                   try {
                       socket.close();
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }
               if(outputStream!=null){
                   try {
                       outputStream.close();
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }
           }
       }
   }


}
