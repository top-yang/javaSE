package cn.hao.collection.set;

import cn.hao.collection.student;
import org.junit.Test;

import javax.crypto.interfaces.PBEKey;
import java.util.*;

public class demo {
    public static void main(String[] args) {
        Set<student> students=new HashSet<>();
        student s1=new student("hh",1);
        student s2=new student("heihei",2);
        student s3=new student("laugh",3);
        student s4=new student("laugh",3);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println(students);
    }

    @Test
    public void testLinkedHashSet(){
        LinkedHashSet<String> stringLinkedHashSet=new LinkedHashSet<>();
        stringLinkedHashSet.add("hello");
        stringLinkedHashSet.add("2");
        stringLinkedHashSet.add("2");
        stringLinkedHashSet.add("3");
        for (String s : stringLinkedHashSet) {
            System.out.println(s);
        }
    }

    @Test
    public void testTreeSet(){
//        TreeSet<Integer> integers=new TreeSet<>();
//        integers.add(20);
//        integers.add(34);
//        integers.add(19);
//        System.out.println(integers);
        //TreeSet<student> treeSet=new TreeSet<>();//自然排序
        //比较器排序
        TreeSet<student> treeSet=new TreeSet<student>(new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return 0;
            }
        }

        );
        student s1=new student("hh",1,18);
        student s2=new student("heihei",2,19);
        student s3=new student("laugh",3,20);
        student s5=new student("laugh",3,17);
        student s4=new student("laugh",4,18);
        System.out.println(s3.hashCode());
        System.out.println(s5.hashCode());
        if(s3.equals(s5)){
            System.out.println("s3和s5对象相同");
        }
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);
        System.out.println(treeSet);
    }

    @Test
    public void sortscore(){
        TreeSet<student> treeSet=new TreeSet<>(new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return -1*(int)(o1.getChscore()+o1.getMathscore()+o1.getEngscore()-o2.getMathscore()-o2.getEngscore()-o2.getChscore());
            }
        });
        treeSet.add(new student(1,123,125,120));
        treeSet.add(new student(2,108,137,126));
        treeSet.add(new student(3,120,105,120));
        for (student student : treeSet) {
            System.out.println(student.getId());
        }
    }
    /**
     * 生成10个 1-20不重复随机数
     */
    @Test
    public void random(){
        Random random = new Random();
        int a;
        TreeSet<Integer> treeSet=new TreeSet<>();
        while (true){
            a=random.nextInt(20)+1;
            if(treeSet.size()<10){
                treeSet.add(a);
            }else {
                break;
            }
        }
        System.out.println(treeSet);
    }
}
