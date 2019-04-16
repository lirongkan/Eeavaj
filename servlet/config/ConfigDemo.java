package config;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author: lrk
 * 2019/4/16 17:53
 */
@WebServlet(name = "config",
        urlPatterns = "/config",
        initParams = {
                @WebInitParam(name = "name", value = "小明"),
                @WebInitParam(name = "pwd", value = "123456")
        }
)
        public class ConfigDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> e=  this.getInitParameterNames();
        while(e.hasMoreElements()){
            String paramName=e.nextElement();
            String paramValue =this.getInitParameter(paramName);
            System.out.println(paramName+"--"+paramValue);

        }
        System.out.println(this.getServletName());

    }
}
