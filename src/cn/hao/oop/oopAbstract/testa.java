package cn.hao.oop.oopAbstract;

import org.junit.Test;

public class testa extends Action{
    public void dosth(){
        System.out.println("test abstract");
    }

    public void test() {

    }

    @Test
    public void teststudent(){
        Student student=new Student("jaychou","302");
        Teacher teacher=new Teacher("xiaoming","302");
        System.out.println(student);
        System.out.println(teacher);
        student.dosth();
        teacher.dosth();
        teacher.sleep();
        student.sleep();

    }


    public static void main(String[] args) {
        testa testa = new testa();
        testa.dosth();
    }
}
