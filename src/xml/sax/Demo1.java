package xml.sax;


import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

/**
 * @author: lrk
 * 2019/4/11 22:12
 */
public class Demo1 {
    public static void main(String[] args) throws Exception{
        SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
        parser.parse(new File("src/xml/contact.xml"),new MyDefaulthandler());
    }

}
