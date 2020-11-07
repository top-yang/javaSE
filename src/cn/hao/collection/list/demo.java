package cn.hao.collection.list;

import cn.hao.collection.student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("hello");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.add(0,"first");
        System.out.println(list);
        System.out.println(list.get(0));
        String now = list.set(0, "now");
        System.out.println(list);
        System.out.println(now);

//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        System.out.println(list);
    }

    @Test
    public void testlist(){
        List<cn.hao.collection.student> list=new ArrayList<student>();
        for (int i = 0; i < 20; i++) {
            student s1=new student(20+"",i);
            list.add(s1);
        }
        System.out.println(list);

    }
    @Test
    public  void test(){
        List<String> list=new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");
//        Iterator<String> iterator=list.iterator();
//        while(iterator.hasNext()){//遍历线程正在执行
//            if(iterator.next().equals("world")){
//                list.add("javaee");//next方检查到变化时,触发并发修改异常
//            }
//        }

//        用一下方式遍历也会使用到迭代器
//        for (String s : list) {
//
//        }

        for (int i = 0; i < list.size(); i++) {
            String s=list.get(i);
            if(s.equals("world")){
                list.add("javaee");
            }
        }
        System.out.println(list);
    }
    @Test
    public  void testListIterator(){
        List<cn.hao.collection.student> list=new ArrayList<student>();
        for (int i = 0; i < 20; i++) {
            student s1=new student(20+"",i);
            list.add(s1);
        }
        ListIterator<student> studentListIterator = list.listIterator();
//        while (studentListIterator.hasNext()){
//            System.out.println(studentListIterator.next()+""+studentListIterator.nextIndex());
//
////            if(studentListIterator.hasPrevious()){
////                System.out.println(studentListIterator.previous());
////                studentListIterator.next();
////            }
//
//            studentListIterator.add(new student("hhh",21));
//        }
//        studentListIterator = list.listIterator();//初始化
//        while (studentListIterator.hasNext()){
//            System.out.println(studentListIterator.next()+""+studentListIterator.nextIndex());
//        }


        //如何逆向遍历? next到头 再previous回来



    }
}
