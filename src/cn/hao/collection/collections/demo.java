package cn.hao.collection.collections;

import cn.hao.collection.student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList();
        for (int i = 0; i < 20; i++) {
            collection.add(i+"");
        }
//        System.out.println(collection);
//        collection.remove("hello");
//        System.out.println(collection);
//        System.out.println(collection.contains("world"));
//        System.out.println(collection.size());
//        for (String s : collection) {
//            System.out.println(s);
//        }

        //迭代器遍历集合
        Iterator<String> s=collection.iterator();
        while (s.hasNext()){
            System.out.println(s.next());
        }


    }

    @Test
    public void testTraversestudent(){
        Collection<student> students=new ArrayList<student>();
        for (int i = 0; i < 20; i++) {
            student s1=new student("student"+i,i);
            students.add(s1);
        }
        Iterator<student> iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
