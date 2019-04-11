package xml.dom4j_write;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

/**
 * @author: lrk
 * 2019/4/11 20:45
 */
public class Demo1 {
    public static void main(String[] args) throws Exception{
       SAXReader reader = new SAXReader();
       Document doc = reader.read("src/xml/contact.xml");
       //System.out.println(doc);
       Element root =doc.getRootElement();
       String str1 = root.getName();
       //System.out.println(str1);
       List<Element> list = root.elements();
       for(Element l : list){
           System.out.println(l.getName());
       }

        /*FileWriter fr =new FileWriter(new File("f:/contack.xml"));
        XMLWriter xw = new XMLWriter(fr);
        xw.write(doc);
        xw.close();
        fr.close();
        System.out.println(xw);*/

    }

}

/*
*  //1.创建一个xml解析器对象
        SAXReader reader = new SAXReader();
        //2.读取xml文档，返回Document对象
        Document doc = reader.read(new File("src/xml/contact.xml"));
        //3创建一个输出流
        FileOutputStream fos = new FileOutputStream("F:/contact.xml");
        //获取dom4j树并将其格式化为XML格式的流
        XMLWriter writer  =new XMLWriter(fos);

        writer.write(doc);
        writer.close();*/
