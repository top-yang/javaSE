package cn.hao.net.demo.URL;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;

public class demo {
    public static void main(String[] args) throws IOException {
        URL url=new URL("http://weblib.scutnc.cn/themes/headPic/1600329352208.jpg");
        System.out.println(url.getHost());
        HttpURLConnection urlConnection= (HttpURLConnection) url.openConnection();
        InputStream is=urlConnection.getInputStream();
        FileOutputStream fos=new FileOutputStream("hello.jpg");
        byte []buffer =new byte[102400];
        int len;
        while ((len=is.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }
    }
}
