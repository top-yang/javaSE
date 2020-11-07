package cn.hao.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class twoKindList {
    public static void main(String[] args) {
//        ArrayList<String> arrayList=new ArrayList<>();
//        arrayList.add("hello");
//        arrayList.add("world");
//        arrayList.add("java");
//        ListIterator<String> stringListIterator = arrayList.listIterator();
//        while (stringListIterator.hasNext()){
//            System.out.println(stringListIterator.next());
//        }
//        for (String s : arrayList) {
//            System.out.println(s);
//        }
//        arrayList.remove(2);
//        for (int i = 0; i < arrayList.size(); i++) {
//            String s1=arrayList.get(i);
//            System.out.println(s1);
//        }

        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("link");
        linkedList.add("the");
        linkedList.add("world");
        for (String s : linkedList) {
            System.out.println(s);
        }
//        ListIterator<String> stringListIterator1 = linkedList.listIterator();
//        while (stringListIterator1.hasNext()){
//            System.out.println(stringListIterator1.next());
//        }
//        for (int i = 0; i < linkedList.size(); i++) {
//            String s=linkedList.get(i);
//            System.out.println(s);
//        }
        linkedList.addFirst("head");
        linkedList.addLast("tail");
        linkedList.addLast("final");
        System.out.println(linkedList);
//        for (String s : linkedList) {
//            System.out.println(s);
//        }
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);
    }
}
