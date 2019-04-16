package init;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: lrk
 * 2019/4/16 17:18
 */
@WebServlet(value={"/init"})
public class Init extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("无参数的初始化方法");
    }

    @Override
    public void destroy() {
        System.out.println("对象销毁");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("deal with get methods.");
    }
}
