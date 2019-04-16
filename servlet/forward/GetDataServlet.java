package forward;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: lrk
 * 2019/4/16 19:35
 */
@WebServlet(name="get",value="/get")
public class GetDataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //不能创建一个新的context对象！！
        // ServletContext context= this.getServletContext();
        String name = (String)this.getServletContext().getAttribute("name");
       System.out.println(name);
    }
}
