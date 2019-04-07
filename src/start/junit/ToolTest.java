package start.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToolTest {
    @Test
    public void getMax() {
        int max = Tool.getMax();
        //断言
//Assert.assertSame(5, max); // expected 期望   actual  真实     ==
//		Assert.assertSame(new String("abc"), "abc");
//		Assert.assertEquals(new String("abc"), "abc"); //底层是使用Equals方法比较的
//		Assert.assertNull("aa");
//		Assert.assertTrue(true);
    }

    @Test
    public void getMin() {
    }
}
