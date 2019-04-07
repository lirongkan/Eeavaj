package start.introspector;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;


import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author: lrk
 * 2019/4/7 20:07
 */
public class Demo3 {
    public static void main(String[] args) throws Exception {
        String id ="110";
        String name="陈其";
        String salary = "1000.0";
        String birthday = "2013-12-10";


        ConvertUtils.register((type, value) -> {
            Date date =null;
            try{
                SimpleDateFormat dateFormat =new SimpleDateFormat("yyyy-MM-dd");
                        date = dateFormat.parse((String)value);
            }catch(Exception e){
                e.printStackTrace();
            }
            return date;
        }, Date.class);
        Emp e = new Emp();
        BeanUtils.setProperty(e,"id",id);
        BeanUtils.setProperty(e,"name",name);
        BeanUtils.setProperty(e,"salary",salary);
        BeanUtils.setProperty(e,"birthday",birthday);

        System.out.println(e);
    }

}
