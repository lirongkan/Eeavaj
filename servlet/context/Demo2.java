package context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**暂时还不知道注解的实际用法，以及ServletContext域对象的参数设置，只好用老方法，原生Servlet
 * @author: lrk
 * 2019/4/16 18:32
 */
@WebServlet(name="demo2",
        urlPatterns="/demo2",
       initParams = {
        @WebInitParam(name ="a",value="aaa"),
               @WebInitParam(name ="b",value="bbb")
       }
)
public class Demo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context =this.getServletContext();
        Enumeration<String> e = context.getInitParameterNames();
        while(e.hasMoreElements()){
            String name = e.nextElement();
            String value = context.getInitParameter(name);
            System.out.println(name+"----"+value);
        }
        System.out.println("AAA= "+context.getInitParameter("AAA"));


    }
}
