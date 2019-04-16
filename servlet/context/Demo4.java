package context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: lrk
 * 2019/4/16 19:14
 */
@WebServlet(name="demo4",value="/demo4")
public class Demo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context=  this.getServletContext();
       Student stuInfo = (Student) context.getAttribute("student");
        System.out.println(stuInfo);
    }
}
