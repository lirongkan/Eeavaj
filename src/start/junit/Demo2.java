package start.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author: lrk
 * 2019/4/7 23:00
 */
public class Demo2 {

    //准备测试的环境
    //@Before
    @BeforeClass
    public static void beforeRead(){
        System.out.println("准备测试环境成功...");
    }


    //读取文件数据，把把文件数据都
    @Test
    public void readFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("F:\\a.txt");
        int content  = fileInputStream.read();
        System.out.println("内容："+content);
    }


    @Test
    public void sort(){
        System.out.println("读取文件数据排序..");
    }


    //清理测试环境的方法
//	@After
    @AfterClass
    public static void afterRead(){
        System.out.println("清理测试环境..");
    }


}