package xml;

/**
 * @author: lrk
 * 2019/4/11 18:43
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 把xml文档信息封装到对象中
 * @author APPle
 *
 */
public class Demo4 {

    public static void main(String[] args) throws Exception{
        List<Contact> list = new ArrayList<>();

        //读取xml，封装对象
        SAXReader reader = new SAXReader();
        Document doc = reader.read(new File("src/xml/contact.xml"));
        //读取contact标签
        Iterator<Element> it = doc.getRootElement().elementIterator("contact");
        while(it.hasNext()){
            Element elem = it.next();
            //创建Contact
            Contact contact = new Contact();
            contact.setId(elem.attributeValue("id"));
            contact.setName(elem.elementText("name"));
            contact.setAge(elem.elementText("age"));
            contact.setPhone(elem.elementText("phone"));
            contact.setEmail(elem.elementText("email"));
            contact.setQq(elem.elementText("qq"));
            list.add(contact);
        }

        for (Contact contact : list) {
            System.out.println(contact);
        }


    }
}
