package cn.hao.collection.map;

import cn.hao.collection.student;
import org.junit.Test;

import java.util.*;

public class test {
    @Test
    public void tetsmap(){
        Map<String,cn.hao.collection.student> stringstudentMap=new HashMap<>();
        String name1="xiaoming";
        stringstudentMap.put(name1,new student(name1,12));
        String name2="xiaoming2";
        stringstudentMap.put(name2,new student(name2,13));
        String name3="xiaoming3";
        stringstudentMap.put(name3,new student(name3,14));
        Set<Map.Entry<String,student>> entries=stringstudentMap.entrySet();
        for (Map.Entry<String, student> entry : entries) {
            System.out.println(entry.getKey()+entry.getValue());
        }
    }
    @Test
    public void testArraylistAndHashMap(){
        Collection<HashMap<String,String>> hashMapCollection= new ArrayList<>();
        Map<String,String> map1=new HashMap<>();
        map1.put("hh","jjjj");
        map1.put("hjf","dj");
        Map<String,String> map2=new HashMap<>();
        map2.put("hh1","jjjj");
        map2.put("hjf2","dj");
        Map<String,String> map3=new HashMap<>();
        map3.put("hh3","jjjj");
        map3.put("hj4f","dj");
        hashMapCollection.add((HashMap<String, String>) map1);
        hashMapCollection.add((HashMap<String, String>) map2);
        hashMapCollection.add((HashMap<String, String>) map3);
        for (HashMap<String, String> stringStringHashMap : hashMapCollection) {
            Set<Map.Entry<String,String>> set=stringStringHashMap.entrySet();
            for (Map.Entry<String, String> stringStringEntry : set) {
                System.out.println(stringStringEntry.getKey()+"---"+stringStringEntry.getValue());
            }
        }
    }
    @Test
    public void testArraylistAndHashMap2(){
        Map<String,ArrayList> stringArrayListMap=new HashMap<>();
        ArrayList<String> stringArrayList1=new ArrayList<>();
        stringArrayList1.add("hh");
        stringArrayList1.add("hh2");
        ArrayList<String> stringArrayList2=new ArrayList<>();
        stringArrayList2.add("a2hh2");
        ArrayList<String> stringArrayList3=new ArrayList<>();
        stringArrayList3.add("a3hh3");
        stringArrayListMap.put("a1",stringArrayList1);
        stringArrayListMap.put("a2",stringArrayList2);
        stringArrayListMap.put("a3",stringArrayList3);
        Set<Map.Entry<String,ArrayList>> entries=stringArrayListMap.entrySet();
        for (Map.Entry<String, ArrayList> entry : entries) {
            ArrayList<String> stringArrayList=entry.getValue();
            for (String s : stringArrayList) {
                System.out.println(s);
            }
        }
        Set<String> stringSet=stringArrayListMap.keySet();
        for (String s : stringSet) {
            ArrayList<String> stringArrayList=stringArrayListMap.get(s);
            for (String s1 : stringArrayList) {
                System.out.println(s1);
            }
        }
    }
    @Test
    //统计单词字符个数
    public void countChar(){
        String s=null;
        Scanner scanner=new Scanner(System.in);
        s=scanner.next();
//        Map<String,Integer> stringIntegerMap=new HashMap<>();
        Map<String,Integer> stringIntegerMap=new TreeMap<>();

        System.out.println(s.length());
        for (int i = 0; i < s.length(); i++) {
            if(!stringIntegerMap.containsKey(String.valueOf(s.charAt(i))))
            {
                stringIntegerMap.put(String.valueOf(s.charAt(i)),1);
            }else{
                int num=stringIntegerMap.get(String.valueOf(s.charAt(i)))+1;
                stringIntegerMap.put(String.valueOf(s.charAt(i)),num);
            }
        }
        Set<Map.Entry<String,Integer>> entries=stringIntegerMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.print(entry.getKey()+"("+entry.getValue()+")");
        }
    }

    @Test
    public void testcollections(){
        ArrayList<String> stringArrayList1=new ArrayList<>();
        stringArrayList1.add("hh3");
        stringArrayList1.add("hh2");
        stringArrayList1.add("hh43");
        stringArrayList1.add("ah21");
        stringArrayList1.add("hh25");

        Collections.sort(stringArrayList1);//升序
        System.out.println(stringArrayList1);
        Collections.reverse(stringArrayList1);//反转
        System.out.println(stringArrayList1);
        Collections.shuffle(stringArrayList1);//洗牌
        System.out.println(stringArrayList1);

    }
    public String generatepages(char c,int i){
        return String.valueOf(c)+String.valueOf(i);
    }
    @Test
    /**
     * 洗牌 发牌
     */
    public void doudizhu(){
        ArrayList<String> stringArrayList=new ArrayList<>();
        for (int i = 0; i < 4; i++) {
                for (int i1 = 2; i1 <= 10; i1++) {
                    stringArrayList.add(""+i1);
                }
            stringArrayList.add("J");
            stringArrayList.add("Q");
            stringArrayList.add("K");
            stringArrayList.add("A");
        }
        stringArrayList.add("Joker");
        stringArrayList.add("smallJoker");
        System.out.println(stringArrayList.size());
        Collections.shuffle(stringArrayList);
        ArrayList<String> stringArrayList1=new ArrayList<>();
        ArrayList<String> stringArrayList2=new ArrayList<>();
        ArrayList<String> stringArrayList3=new ArrayList<>();
        Random random = new Random();
        int dizhu=random.nextInt(53);
        for (int i = 0; i < stringArrayList.size()-3; i++) {
            if(i%3==0){
                stringArrayList1.add(stringArrayList.get(i));
            }else if(i%3==1){
                stringArrayList2.add(stringArrayList.get(i));
            }else{
                stringArrayList3.add(stringArrayList.get(i));
            }
        }
        if(dizhu%3==0){
            stringArrayList1.add(stringArrayList.get(51));
            stringArrayList1.add(stringArrayList.get(52));
            stringArrayList1.add(stringArrayList.get(53));
        }else if(dizhu%3==1){
            stringArrayList2.add(stringArrayList.get(51));
            stringArrayList2.add(stringArrayList.get(52));
            stringArrayList2.add(stringArrayList.get(53));
        }else{
            stringArrayList3.add(stringArrayList.get(51));
            stringArrayList3.add(stringArrayList.get(52));
            stringArrayList3.add(stringArrayList.get(53));
        }
        Collections.sort(stringArrayList1);
        Collections.sort(stringArrayList2);
        Collections.sort(stringArrayList3);
        System.out.println(stringArrayList1);
        System.out.println(stringArrayList2);
        System.out.println(stringArrayList3);

    }
}
