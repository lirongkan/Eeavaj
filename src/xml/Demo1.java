package xml;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @author: lrk
 * 2019/4/11 13:55
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        SAXReader reader = new SAXReader();
        Document doc = reader.read(new File("src/xml/contact.xml"));
        System.out.println(doc.getClass());

        //设定为当前文件夹
        File directory = new File("");
//获取绝对路径
        String absolutePath = directory.getAbsolutePath();
        System.out.println(absolutePath);
//对字符串进行拼接，具体要自己测试下
        InputStream is = new FileInputStream(absolutePath + "\\src\\xml\\contact.xml");
        InputStreamReader isr = new InputStreamReader(is, "utf-8");
        int len = 0;
        while ((len = isr.read()) != -1) {
            System.out.print((char) len);
        }


        String xpath = "//name";
        List<Node> list = doc.selectNodes(xpath);
        for (Node node : list) {
            System.out.println(node.getName());

        }

    }
}
