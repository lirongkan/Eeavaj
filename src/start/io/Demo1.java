package start.io;


import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author: lrk
 * 2019/4/7 14:29
 */
public class Demo1 {
    public static void main(String[] args) throws Exception{

        //readFile();
        testInput();
    }


    public static void readFile() throws IOException{
        FileReader fr= new FileReader("E:\\a.txt");
        int len = 0;
        while((len = fr.read()) != -1){
            System.out.println((char)len);

        }
    }

    public static void testOuput()throws Exception{
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);
        OutputStream out = socket.getOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(out);
        writer.write("Hello,TCP!");
        socket.close();
    }
    public static void testInput()throws Exception{
        InputStream in = System.in;
        /*在控制台输入中文后，出现乱码就是对的，因为IDE使用的是UTF-8*/
        InputStreamReader input = new InputStreamReader(in,"gbk");
        BufferedReader br = new BufferedReader(input);
        System.out.println(br.readLine());
    }


}
