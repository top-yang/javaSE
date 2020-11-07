package cn.hao.io.demo.heima.ReaderWriter;

import org.junit.Test;

import java.io.*;

public class ReaderWriterTest {
    @Test
    public void testdemo() throws IOException {

//        FileOutputStream fos=new FileOutputStream("test1.txt");
//        OutputStreamWriter writer=new OutputStreamWriter(fos,"utf-8");      可解决编码问题
//        writer.write("中国");
//        writer.close();
//        fos.close();
        FileInputStream fis = new FileInputStream("src\\cn\\hao\\oop\\oop01\\demo02.java");
        InputStreamReader inputStreamReader = new InputStreamReader(fis);

        //一个字符一个字符的读
//        int by;
//        while((by=inputStreamReader.read())!=-1) {
//            System.out.println((char)by);
//        }
        char[] chars = new char[1024];
        int len;
        while((len=inputStreamReader.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }

    }

    @Test
    /**
     * 字符流复制文件
     */
    public void copyjava() throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("src\\cn\\hao\\oop\\oop01\\demo02.java"));
        OutputStreamWriter outputStreamWriter =new OutputStreamWriter(new FileOutputStream("copyjava.txt"));
        char []buffer=new char[10];
        int len;
        while((len=inputStreamReader.read(buffer))!=-1){
            outputStreamWriter.write(buffer,0,len);
        }
        outputStreamWriter.close();
        inputStreamReader.close();
    }

    @Test
    /**
     * 字符流复制文件
     */
    public void copyjava_v2() throws IOException {
      //  InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("src\\cn\\hao\\oop\\oop01\\demo02.java"));
      //  OutputStreamWriter outputStreamWriter =new OutputStreamWriter(new FileOutputStream("copyjava.txt"));
        FileReader fileReader=new FileReader("src\\cn\\hao\\oop\\oop01\\demo02.java");
        FileWriter fileWriter=new FileWriter("copyjava2.txt");
        char []buffer=new char[10];
        int len;
        while((len=fileReader.read(buffer))!=-1){
            fileWriter.write(buffer,0,len);
        }
        fileReader.close();
        fileWriter.close();
    }

    @Test
    /**
     * 测试字节缓冲流
     */
    public void testBuffer() throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader("copyjava.txt"));
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("copyjava_bak.txt"));
//        char [] buffer=new char[1024];
//        int len;
//        while((len=bufferedReader.read(buffer))!=-1){
//            bufferedWriter.write(buffer,0,len);
//        }
        System.out.println(bufferedReader.readLine());
        bufferedReader.close();
        bufferedWriter.close();

    }
}
