package cn.hao.io.demo.heima.File;

import org.junit.Test;

import javax.swing.text.StyledEditorKit;
import java.io.File;
import java.io.IOException;

/**
 *
 * File类的使用
 * @author 86189
 */
public class demo {
    public static void main(String[] args) throws IOException {
        File file=new File("test.txt");

//        File file1=new File("test1.txt");
//        file1.createNewFile();

//        File dirs=new File("testmkdir\\testmkdir1");
//        dirs.mkdir();

        File files=new File("testdirs\\test\\test");
        files.mkdirs();
        files.delete();

        System.out.println(file);

    }

    public void dfsdirs(File file){
        File[] list=file.listFiles();
        if(list!=null){
            for (File file1 : list) {

                if(file1.isDirectory()&&file1.list().length>10){
                    System.out.println(file1.getAbsolutePath());
                    dfsdirs(file1);
                }

            }
        }
    }

    @Test
    public void traverseDirs(){
        File file=new File("C:\\Windows");
        dfsdirs(file);
    }
}
