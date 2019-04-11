package xml.dom4j_write;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: lrk
 * 2019/4/11 21:41
 */
public class Demo3 {
    public static void main(String[] args) throws Exception {
        List<Contact> list = new ArrayList<>();

        SAXReader reader = new SAXReader();
        Document doc = reader.read("src/xml/contact.xml");
        Iterator<Element> it = doc.getRootElement().elementIterator();
        while (it.hasNext()) {
            Element elem = it.next();
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
