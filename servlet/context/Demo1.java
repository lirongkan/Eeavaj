package context;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: lrk
 * 2019/4/16 18:22
 */
@WebServlet(name="demo1",value = {"/demo1"})
public class Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      ServletContext context = this.getServletContext();
        String contextPath = context.getContextPath();
        System.out.println(contextPath);
        resp.sendRedirect(contextPath+"/index.html");

    }
}
