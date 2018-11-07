package cn.hit.hadoop.rpc;

/**
 * Created by Administrator on 2018/10/30.
 */
public class Student {
    private  String name;
    private String sex;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String toString(){
        return this.getName()+"with"+this.getSex();
    }
}
