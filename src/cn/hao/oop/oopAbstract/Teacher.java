package cn.hao.oop.oopAbstract;

public class Teacher extends Person{
    public String class_number;

    public Teacher(){}

    public Teacher(String name,String class_number)
    {
        this.name=name;
        this.class_number=class_number;
    }

    @Override
    public void dosth() {
        System.out.println("老师讲课");
    }

    @Override
    public void sleep() {
        System.out.println("老师955");
    }

    @Override
    public String toString() {
        super.toString();
        return "Teacher{" +
                "class_number='" + class_number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
