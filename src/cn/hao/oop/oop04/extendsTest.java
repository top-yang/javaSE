package cn.hao.oop.oop04;

import org.junit.Test;

public class extendsTest {






















    public static void main(String[] args) {
//        Student student = new Student();
//        Teacher teacher = new Teacher();
//        student.setName("student1");
//        student.setSid(143798);
//        teacher.setTid(003);
//        teacher.setName("teacher1");
//        Person person=new Person();
   //     person.dosth();
       // System.out.println(student);
//        System.out.println(teacher);
//        student.eat();
//        student.dosth();
//        student.move();
       // student.test();
//        student.go();
//        teacher.eat();
//        teacher.dosth();

//        Student student1 = new Student();
//        System.out.println(student1);





        //测试多态
        Person person=new Teacher("teacher wang");//父类引用指向子类对象
        Teacher teacher=new Teacher("hhh");



     //   Person.teststatic();
    //    person.teststatic();//静态方法只看左边的引用
     //   teacher.teststatic();//

/**
 * 多态是方法的动态
 * */
        person.dosth();
        teacher.dosth();
//        person.teacherdo();//不能执行
        ((Teacher)person).teacherdo();//可以执行
        teacher.teacherdo();

        System.out.println(teacher instanceof Person);
        System.out.println(teacher instanceof Object);
        System.out.println(teacher instanceof Teacher );
        System.out.println(person instanceof Teacher);
    }
}
