package cn.hao.oop.oop04;

public class Teacher extends Person{
    private int tid;
    public Teacher(String name){
        this.setName(name);
    }
    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Override
    public void dosth() {
        System.out.println("teacher teach...");
    }

    public static void teststatic(){
        System.out.println("teacher static");
    }

    public void dosth(int a){
        System.out.println(a);
    }

    public void teacherdo(){
        System.out.println("teacherdo...");
    }



}
