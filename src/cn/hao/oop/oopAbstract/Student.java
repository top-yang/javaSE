package cn.hao.oop.oopAbstract;

public class Student extends Person {

    public String class_number;
    public Student(){}

    public Student(String name,String class_number){
        this.name=name;
        this.class_number=class_number;
    }

    public void hh(){
        System.out.println("我在笑");
    }

    @Override
    public void dosth() {
        System.out.println("学生上学...");
    }

    @Override
    public void sleep() {
        System.out.println("学生996");
    }

    @Override
    public String toString() {
        super.toString();
        return "Student{" +
                "class_number='" + class_number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
