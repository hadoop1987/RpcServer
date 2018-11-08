package cn.hit.hadoop.rpc;


/**
 * Created by Administrator on 2018/10/30.
 */
public class JavaReflectionTest {

    public static  void  main(String args[]){

        try {
            Class<Student> s = (Class<Student>) Class.forName("cn.hit.hadoop.rpc.Student");
            try {
                Student student =s.newInstance();
                student.setName("sss");
                student.setSex("female");
                System.out.println(student.toString());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
