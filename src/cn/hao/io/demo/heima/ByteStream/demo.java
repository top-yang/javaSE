package cn.hao.io.demo.heima.ByteStream;

import org.junit.Test;

import javax.xml.transform.Source;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class demo {
    @Test
    /**
     * 字节输入流 以字节数组来读文件
     */
    public void testReadByBytes() throws IOException {
        //字节流读数据 以字节数组方式读
        FileInputStream fis=new FileInputStream("fos.txt");
        byte[] buffer=new byte[5];
        int len;
        while((len=fis.read(buffer))!=-1){
            System.out.println(new String(buffer,0,len));
        }
        fis.close();
    }

    @Test
    /**
     * 字节输入流 一个字节一个字节的读文件
     */
    public void testReadByByte() throws IOException {
        //构造方法 可直接用文件路径构造
        FileInputStream fis=new FileInputStream("fos.txt");
        int by;
        while((by=fis.read())!=-1){
            System.out.print((char)(by));
        }

    }


    @Test
    public void testwrite() throws IOException {
        //添加可追加参数
        FileOutputStream fos=new FileOutputStream("fos.txt",true);
//        //写小写字符b到文件
//        fos.write(97);
//        //对应字符9
//        fos.write(57);
//        fos.write("begin".getBytes());
//        fos.write(buffer,0,31);
//        fos.close();

//        //写入换行数据
//        for (int i = 0; i < 10; i++) {
//            //不同的操作系统换行符不同
//            fos.write("hello\n".getBytes());
//        }






        fos.close();
    }

    @Test
    public void testByteWrite() throws IOException {
        FileOutputStream fos=new FileOutputStream("hh.txt");
        fos.write(97);
    }

    public void copyByBytes(FileInputStream fis,FileOutputStream fos) throws IOException {
        byte[] buffer=new byte[1024];
        int len;
        while ((len=fis.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }
        fos.close();
        fis.close();

    }


    public void copyByBufferBytes(FileInputStream fis,FileOutputStream fos) throws IOException {
        BufferedInputStream bufferedInputStream=new BufferedInputStream(fis);
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fos);

        byte[] buffer=new byte[1024];
        int len;
        while ((len=bufferedInputStream.read(buffer))!=-1){
            bufferedOutputStream.write(buffer,0,len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
        fos.close();
        fis.close();
    }
    public void copyByByte(FileInputStream fis,FileOutputStream fos) throws IOException {
        //
        int by;
        while((by=fis.read())!=-1){
            fos.write(by);
        }
        fos.close();
        fis.close();
    }
    public void copyByBufferByte(FileInputStream fis,FileOutputStream fos) throws IOException {
        //
        BufferedInputStream bufferedInputStream=new BufferedInputStream(fis);
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fos);
        int by;
        while((by=bufferedInputStream.read())!=-1){
            bufferedOutputStream.write(by);
        }

        bufferedOutputStream.close();
        bufferedInputStream.close();
        fos.close();
        fis.close();

    }

    @Test
    /**
     * 用字节数组复制图片
     */
    public void copyImage() throws IOException {
        FileInputStream fis=new FileInputStream("test.jpg");
        FileOutputStream fos=new FileOutputStream("testbak.jpg");
        byte []buffer =new byte[1024];
        int len;
        while((len=fis.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }
        fos.close();
        fis.close();
    }


    /**
     *
     */
    @Test
    public void testBuffer() throws IOException {

//        FileOutputStream fos=new FileOutputStream("bos.txt");
//        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fos);
//        bufferedOutputStream.write("helloworld".getBytes());
//        bufferedOutputStream.write("hh".getBytes());
//        bufferedOutputStream.close();
//        fos.close();


        BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream("bos.txt"));

        //一次读一个字节
//        int by;
//        while ((by=bufferedInputStream.read())!=-1){
//            System.out.println((char)by);
//        }

        //一次以字节数组读取
        byte [] buffer=new byte[1024];
        int len;
        while((len=bufferedInputStream.read(buffer))!=-1){
            System.out.println(new String(buffer,0,len));
        }
    }



    @Test
    /**
     * 四种方式复制视频 基本方式：字节和字节数组 缓冲方式 ：字节和字节数组
     */
    public void copyVideo() throws IOException {


        for (int i = 0; i < 4; i++) {
            FileInputStream fis=new FileInputStream("video.mp4");
            FileOutputStream fos=new FileOutputStream("videobak.mp4");
            if(i==0){
                long starttime=System.currentTimeMillis();
                copyByByte(fis,fos);
                long endtime=System.currentTimeMillis();
                System.out.println("该方式共耗时"+(endtime-starttime)+"毫秒");
            }else if(i==1){
                long starttime=System.currentTimeMillis();
                copyByBytes(fis,fos);
                long endtime=System.currentTimeMillis();
                System.out.println("该方式共耗时"+(endtime-starttime)+"毫秒");
            }else if(i==2){
                long starttime=System.currentTimeMillis();
                copyByBufferByte(fis,fos);
                long endtime=System.currentTimeMillis();
                System.out.println("该方式共耗时"+(endtime-starttime)+"毫秒");
            }else{
                long starttime=System.currentTimeMillis();
                copyByBufferBytes(fis,fos);
                long endtime=System.currentTimeMillis();
                System.out.println("该方式共耗时"+(endtime-starttime)+"毫秒");
            }


        }

    }

    @Test
    /**
     * 测试编码与解码
     */
    public void testCodeing() throws UnsupportedEncodingException {
        String s="华南理工";

        //编码
        byte[] bytes = s.getBytes();
        //[-27, -115, -114, -27, -115, -105, -25, -112, -122, -27, -73, -91]     utf-8
        System.out.println(Arrays.toString(bytes));

        byte[] bytes1=s.getBytes("gbk");
        //[-69, -86, -60, -49, -64, -19, -71, -92]  gbk
        System.out.println(Arrays.toString(bytes1));

        //解码
        System.out.println(new String(bytes, StandardCharsets.UTF_8));
        System.out.println(new String(bytes,"gbk"));

    }


}
