package cn.hao.oop.oop03;
//封装：属性私有和get/set
public class fengzhuang {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("kobe");
        //student.name="11" 私有变量报错
        System.out.println(student.getName());
    }
}
