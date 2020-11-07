package cn.hao.oop.oop01;

public class demo03 {
    public static void main(String[] args) {
//        int add = demo03.add(2, 3);
//        System.out.println(add);


//
//        int a=1;
//        a=demo03.changenumber(a);
//        System.out.println(a);
        person p=new person();
        demo03.changename(p);

        System.out.println(p.name);


    }

    public static int add(int a,int b){

        return a+b;
    }

    public static  void change(int a){
        a=10;//不会变
    }

    public static int changenumber(int a){
        a=10;
        return a;//返回的值会变
    }

    public static void changename(person p){
        p.name="hh";//具体对象的属性如name会变
    }
}
class person{
    String name;
}
