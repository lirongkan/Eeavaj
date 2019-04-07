package start.introspector;

import org.junit.Test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**内省----一个变态的反射
 * 主要解决问题：将对象的属性封装 到对象中
 * @author: lrk
 * 2019/4/7 19:29
 */

public class Demo2 {
    public static void main(String[] args) throws Exception{
       // getAllProperty();
        testProperty();
    }
    public static  void getAllProperty() throws IntrospectionException{
        BeanInfo beaninfo = Introspector.getBeanInfo(Person.class);
        PropertyDescriptor[] descriptors = beaninfo.getPropertyDescriptors();
        for(PropertyDescriptor p :descriptors){
            System.out.println(p.getReadMethod());

        }
    }

    public static void testProperty() throws Exception{
        Person p =new Person();
        PropertyDescriptor descriptor = new PropertyDescriptor("id",Person.class);
        Method m= descriptor.getWriteMethod();
        m.invoke(p,110);

        Method readMethod = descriptor.getReadMethod();
        System.out.println(readMethod.invoke(p));
    }


}
