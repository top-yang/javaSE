package cn.hao.net.practice.tcp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=null;
        Socket socket=null;
        InputStreamReader inputStreamReader=null;
        //启动服务器后一直监听
        while (true) {
            try {
                //1.服务器实例化一个ServerSocket对象，表示要通过服务器上的端口9527通信
                serverSocket=new ServerSocket(9527);
                //2.服务器调用 ServerSocket 类的 accept() 方法，该方法将一直等待，直到客户端连接到服务器上给定的端口。
                socket=serverSocket.accept();

                //3.服务器接收客户端发来的字符
                inputStreamReader=new InputStreamReader(socket.getInputStream());
                char[] bytes=new char[100];
                int len;
                while((len=inputStreamReader.read(bytes))!=-1){
                    System.out.println(new String(bytes,0,len));
                }
            }catch (Exception e){
           e.printStackTrace();
        }finally {
                inputStreamReader.close();
                socket.close();
                serverSocket.close();
            }
        }
    }
}
