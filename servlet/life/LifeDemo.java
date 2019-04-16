package life;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: lrk
 * 2019/4/16 16:53
 */
@WebServlet(name="LifeDemo",value={"/life1"})
public class LifeDemo extends HttpServlet {
    public LifeDemo(){
        System.out.println("servlet 对象被创建了！");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("2.init methods 调用");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("3.service 方法被调用。");
    }

    @Override
    public void destroy() {
        System.out.println("destroy.");
    }
}
