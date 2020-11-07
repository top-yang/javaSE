package cn.hao.oop.excption;

public class demo1 {

    public  static  double test(int a,int b) throws Exception {
        if (b==0){
            throw new Exception();
        }

        return a/b;
    }

    public static void a(){
        b();
    }
    public static void b(){
        a();
    }


    public static void main(String[] args) throws Exception {
        int a=1;
        int b=0;
        double c=test(9,0);
        System.out.println(c);
        try {
            if(b==0){
                throw new Exception();//主动抛出异常
            }
        }catch (Exception e){

        }finally {

        }

        try {
            System.out.println(a/b);
        }catch (Throwable e){
            System.out.println("除零异常");
        }finally {
            System.out.println("finally");
        }

        try {
            a();
        }catch (Exception e){
            System.out.println("有异常");
        }catch (Throwable e){
            System.out.println("有抛出");
        }finally {
            System.out.println("善后");
        }

    }
}
