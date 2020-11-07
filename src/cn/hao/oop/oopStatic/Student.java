package cn.hao.oop.oopStatic;

public class Student {
    private static int age;
    private double score;
    public Student(){
        System.out.println("构造器来了");
    }
    static {
        //静态代码块
        System.out.println("类加载时调用一次");
    }


    {
        System.out.println("匿名代码块");
    }

    public void run(){
        System.out.println("run");
        go();
    }
    public void aoprun(){
        run();
    }
    public static void go(){
        System.out.println("go");

    }


    public static void main(String[] args) {
        //run(); non-static can't use static method
        go();
        Student.go();
        Student.age=10;
        Student student = new Student();
        Student student1=new Student();
        student.score=22;
        System.out.println(student.age);
        System.out.println(Student.age);
        student.run();
    }
}
