package start.path;

import java.io.File;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author: lrk
 * 2019/4/7 13:44
 */
public class Dbutil {
    static Properties pro ;
    static{
        try {
            pro = new Properties();
            Class clazz = Dbutil.class;
            /*----"/"代表classpath路径，加载的class文件所在的路径，然后再去找----*/
            InputStream in = clazz.getResourceAsStream("/start/path/db.properties");
            pro.load(in);
        }catch(Exception ex){
           System.out.println(ex);
        }
    }
    public static void main(String[] args){
        System.out.println("当前路径"+new File(".").getAbsolutePath());
        System.out.println("用户名"+pro.getProperty("username")+" 密码： "+pro.getProperty("password"));
    }
}
