package start.introspector;

import org.apache.commons.beanutils.BeanUtils;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Sorry mom, tonight.
 *
 * @author: lrk
 * 2019/4/7 22:32
 */
public class Mom {
    public static void main(String[] args) throws IntrospectionException, IllegalAccessException, InvocationTargetException {
       /* Mother m = new Mother();
        PropertyDescriptor des = new PropertyDescriptor("love", Mother.class,
                "getLove", "setLove");
        Method write =des.getWriteMethod();
        write.invoke(m,"无数个");
        Method read = des.getReadMethod();
        read.invoke(m);

        PropertyDescriptor des2 = new PropertyDescriptor("heart", Mother.class,
                "getHeart", "setHeart");
        Method write2 =des2.getWriteMethod();
        write2.invoke(m,46);
        Method read2= des2.getReadMethod();
        read2.invoke(m);
        System.out.println(m);*/
        Mother mom = new Mother();
        BeanUtils.setProperty(mom, "love", "12");
        BeanUtils.setProperty(mom, "heart", 12);

        System.out.println(mom);


    }


}