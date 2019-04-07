package start.io;
import java.io.*;


/**
 * @author: lrk
 * 2019/4/7 15:09
 */
public class Demo2 {
    public static void main(String[] args) throws IOException{
//            copy();
        read_2();
    }

    private static void copy() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("e:\\b.txt"));

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("f:\\b.txt"),"utf-8");
        BufferedWriter bw = new BufferedWriter(osw);
        String len;
        while((len = br.readLine()) != null){
            bw.write(len);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        osw.close();
        br.close();

    }
    public static void read() throws IOException {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine());
    }
    public static void read_2()throws IOException{
        FileInputStream fis = new FileInputStream("e:\\a.txt");
        InputStreamReader isr = new InputStreamReader(fis,"gbk");
        BufferedReader fr = new BufferedReader(isr);
        String len ;
        while((len = fr.readLine()) !=null) {
            System.out.println(len);
        }
    }

}

