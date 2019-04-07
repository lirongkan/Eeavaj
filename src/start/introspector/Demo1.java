package start.introspector;

import start.path.Dbutil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @author: lrk
 * 2019/4/7 18:25
 */
public class Demo1 {
    public static void main(String[] args) throws Exception{
        Person p = (Person) getInstance();
        System.out.println(p);
    }
    public static Object getInstance() throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Eeavaj\\src\\start\\introspector\\obj.txt"));
       // String className =  bufferedReader.readLine(); //读取配置文件获取到完整的类名,但是有问题
        Class clazz = Class.forName("start.introspector.Person");
        //通过class对象获取到无参的构造方法
        Constructor constructor = clazz.getConstructor();
        //创建对象
        Object o  = constructor.newInstance();
        //读取属性值
        String line = null;
        while((line = bufferedReader.readLine())!=null){
            String[] datas = line.split("=");
            //通过属性名获取到对应的Field对象。
            Field field = 	clazz.getDeclaredField(datas[0]);
            if(field.getType()==int.class){
                field.set(o, Integer.parseInt(datas[1]));
            }else{
                field.set(o, datas[1]);
            }

        }
        return o;

    }

}
