package xml.dom4j_write;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.util.Iterator;

/**
 * @author: lrk
 * 2019/4/11 21:08
 */
public class Demo2 {
    @Test
    public void test1() throws Exception{
        SAXReader reader = new SAXReader();
        Document doc = reader.read("src/xml/contact.xml");
        Iterator<Node> it= doc.nodeIterator();
        while(it.hasNext()){
            Node node = it.next();
            String name = node.getName();
            System.out.println(name);
            //只是两层偏离而已，没有用递归
            if(node instanceof Element){
                Element elem = (Element) node;
                Iterator<Node> it2 = elem.elementIterator();
                while(it2.hasNext()){
                    Node n2 = it2.next();
                    System.out.println(n2.getName());

                }
            }
        }

    }
@Test

    public void test2() throws Exception{
        /**
         * @Description:使用递归，打印出节点名字
         * @params:[]
         * @return:void
         */

        SAXReader reader = new SAXReader();
        Document doc = reader.read(new File("src/xml/contact.xml"));
        Element root = doc.getRootElement();
        getChildNodes(root);
    }
    @Test
    public void getChildNodes(Element element) {
        System.out.println(element.getName());
        Iterator<Node> it = element.nodeIterator();
        while (it.hasNext()) {
            Node node = it.next();
            if (node instanceof Element) {
                Element el = (Element) node;
                getChildNodes(el);
            }
        }
    }
    @Test
    public void test4() throws Exception{
        SAXReader reader = new SAXReader();
        Document doc =  reader.read("src/xml/contact.xml");
        Element contactElem = doc.getRootElement().element("contact");
        Iterator<Attribute> it =contactElem.attributeIterator();
        while(it.hasNext()){
            Attribute attr =it.next();
            System.out.println(attr.getName()+" "+attr.getValue());

        }
    }



}
