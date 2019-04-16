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
 * 2019/4/16 19:31
 */
@WebServlet(name="forward",value="/forward")
public class ForwardDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /*保存到Request域中*/
        req.setAttribute("name","jack");
        this.getServletContext().getRequestDispatcher("/get").forward(req, resp);
    }
}
