package cn.hao.oop.oop04;

public class Person extends Animal{
    protected String pname="person";
    private String name;
    private String kind="animal";
    public String getKind() {
        return kind;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void move(){
        System.out.println("people move");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
    private void testperson(){
        System.out.println("person的私有方法");
    }


    public void dosth(){
        this.testperson();//私有方法仅能被自己调用
        System.out.println("Person do");
    }
    public static void teststatic(){
        System.out.println("static");
    }
    public void eat(){
        System.out.println(this.name+" eat...");
    }

    public void go(){
        System.out.println(this.name+" running");
    }
}
