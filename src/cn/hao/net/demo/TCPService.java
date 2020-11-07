package cn.hao.net.demo;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPService {
    /**
     *
     */

    @Test
    public void serverEngine(){
        ServerSocket serverSocket=null;
        Socket accept=null;
        InputStream inputStream=null;
        while (true){
            try {
                serverSocket = new ServerSocket(9999);
                accept=serverSocket.accept();
                inputStream=accept.getInputStream();
                int read;
                byte[] mes=new byte[1024];
                while((read=inputStream.read(mes))!=-1){
                    String msg=new String(mes,0,read);
                    System.out.println(msg);
                }



            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if(serverSocket!=null){
                    try {
                        serverSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if(accept!=null){
                    try {
                        accept.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (inputStream!=null){
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }
}
