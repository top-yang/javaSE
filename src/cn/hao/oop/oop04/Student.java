package cn.hao.oop.oop04;

public class Student extends Person {
    private int sid;
    private String pname;
    public Student(){
        this("moren");
        super.setName("hh");
    }
    public Student(String name){
        this.setName(name);
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ",name="+getName()+
                ",kind="+getKind()+
                '}';
    }

    @Override
    public void dosth() {
        System.out.println("student study...");
    }

    @Override
    public void go() {
        super.go();
    }

    public  void test(){
       // System.out.println(this.pname);
      //  System.out.println(super.pname);
//        super.testperson();  私有方法无法调用
        super.move();
    }



}
