package cn.hao.collection;

public class student implements Comparable {
    private int id;
    private String name;
    private int age;
    private double chscore;
    private double mathscore;
    private double engscore;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getChscore() {
        return chscore;
    }

    public void setChscore(double chscore) {
        this.chscore = chscore;
    }

    public double getMathscore() {
        return mathscore;
    }

    public void setMathscore(double mathscore) {
        this.mathscore = mathscore;
    }

    public double getEngscore() {
        return engscore;
    }

    public void setEngscore(double engscore) {
        this.engscore = engscore;
    }

    public student(int id, double chscore, double mathscore, double engscore) {
        this.id = id;
        this.chscore = chscore;
        this.mathscore = mathscore;
        this.engscore = engscore;
    }

    public student(String name, int id){
        this.name=name;
        this.id=id;
    }

    public student(String name, int id,int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return this.id*1118;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        student student = (student) o;
        return id == student.id &&
                name.equals(student.name);
    }

    @Override
    public int compareTo(Object o) {
        student student=(cn.hao.collection.student) o;
//        if(!this.name.equals(student.name)){
//            return this.name.compareTo(student.name);
//        }else{
////            if(this.age<student.age){
////                //返回负数 当前对象在前，比较对象在后
////                return -1;
////            }else if(this.age==student.age){
////                return 0;
////            }else{
////                return 1;
////            }
//            return this.age-student.age;


        //三目运算再简化
        return name.compareTo(student.name)==0?age-student.age:name.compareTo(student.name);
      //  }
    }
}
