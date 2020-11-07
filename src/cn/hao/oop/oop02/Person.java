package cn.hao.oop.oop02;

public class Person {
    String name;
    int age;
    Person(){
        System.out.println("无参构造器调用");
    }
    Person(String name){
        System.out.println("有参构造器调用");
        this.name=name;
        this.age=22;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
