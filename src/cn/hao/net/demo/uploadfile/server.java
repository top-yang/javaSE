package cn.hao.net.demo.uploadfile;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    @Test
    public void receiveFiles() throws IOException {
       while(true){
           ServerSocket serverSocket=new ServerSocket(9999);
           Socket accept = serverSocket.accept();
           InputStream inputStream=accept.getInputStream();

           FileOutputStream fos=new FileOutputStream("receive");
           byte[] files=new byte[1024];
           int len;
           while ((len=inputStream.read(files))!=-1){
               fos.write(files,0,len);
           }

           //通知客户端文件接收完毕
           accept.shutdownInput();
           OutputStream os2 = accept.getOutputStream();
           os2.write("文件接收完毕".getBytes());

           os2.close();
           fos.close();
           inputStream.close();
           accept.close();
           serverSocket.close();
       }



    }
}
