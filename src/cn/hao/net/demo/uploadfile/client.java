package cn.hao.net.demo.uploadfile;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Java网络编程 tcp文件上传 客户端
 *
 * @author 86189
 */
public class client {
    @Test
    public void uploadFiles() throws IOException {
        //创建socket连接
        Socket socket=new Socket(InetAddress.getByName("127.0.0.1"),9999);
        //创建输出流
        OutputStream outputStream=socket.getOutputStream();

        //读文件
        FileInputStream fis=new FileInputStream("test.txt");

        //写文件到输出流

        byte[] files=new byte[1024];
        int len;
        while((len=fis.read(files))!=-1){
            outputStream.write(files,0,len);
        }
        //通知服务器 已经传输完了
        socket.shutdownOutput();


        //接收服务器端返回通知
        InputStream inputStream=socket.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer=new byte[1024];
        int len2;
        while((len2=inputStream.read(buffer))!=-1){
            byteArrayOutputStream.write(buffer,0,len2);
        }
        System.out.println(byteArrayOutputStream.toString());

        byteArrayOutputStream.close();
        inputStream.close();
        fis.close();
        outputStream.close();
        socket.close();

    }
}
