package start.junit;

/**
 * @author: lrk
 * 2019/4/7 23:02
 */
public class Tool {
    public static int getMax(){
        int a = 3;
        int b  =5;
        int max = a>b?a:b;
        return max;
    }

    public static int getMin(){
        int a = 3;
        int b = 5;
        int min = a<b?a:b;
        return min;
    }

}
