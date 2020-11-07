package cn.hao.collection.alltype;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 泛型类
 * @param <T>
 */
public class test<T> {
    private T t;

    public static int sum(int ...num){
        int sum=0;
        for (int i : num) {
            sum+=i;
        }
        System.out.println(num.getClass().getTypeName());
        return sum;
    }
    public test(){

    }
    public test(T t) {
        this.t = t;
    }
    /**
     * 泛型类的使用
     */
    public static void main(String[] args) {
//        test<String> stringtest = new test<String>("hello");
//        System.out.println(stringtest.t);

//        System.out.println(sum(1,2,3,4,5));

        //Arrays工具类的静态方法 返回由指定数组支持的固定大小的列表
        List list= Arrays.asList(1,2,3,4,5);
        System.out.println(list);
        //list接口的静态方法 返回包含任意数量元素的不可变列表
        //List<String> list1=List.
    }

    public void test1(){
        List<?> list1=new ArrayList<String>();
        List<?> list2=new ArrayList<Number>();
        List<?super Integer> list3=new ArrayList<Number>();//Interger及其父类 定义下限
        List<?extends Number>list4=new ArrayList<Integer>();

    }


}
