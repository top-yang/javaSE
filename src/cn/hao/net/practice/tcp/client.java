package cn.hao.net.practice.tcp;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket(InetAddress.getByName("localhost"),9527);
        OutputStreamWriter outputStreamWriter =new OutputStreamWriter(socket.getOutputStream());
        outputStreamWriter.write("客户端请求9527数据");
        outputStreamWriter.close();
        socket.close();

    }
}
