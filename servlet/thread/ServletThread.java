package thread;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: lrk
 * 2019/4/16 17:45
 */
@WebServlet(value={"/thread"})
public class ServletThread extends HttpServlet {
    int count = 1;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        synchronized (ServletThread.class){
            resp.getWriter().write("you are :"+count);
            count++;
        }
    }
}
