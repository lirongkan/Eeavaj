package list;

import com.sun.org.apache.xalan.internal.xsltc.cmdline.getopt.GetOpt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author: lrk
 * 2019/4/18 16:00
 */
@WebServlet(name="ServletLogin" ,urlPatterns={"/ServletLogin"})
public class ServletLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String name= req.getParameter("name");
        String password=req.getParameter("password");
        resp.getWriter().write("qwe");
        if(name.equals("root")&&password.equals("root")){
            //success
           HttpSession session =req.getSession(true);
           session.setAttribute("user",name);
           resp.sendRedirect(req.getContextPath()+"/list");
        }else{
            //fail,回到登录界面
            req.setAttribute("msg","密码或登录名错误！");
            //下一行代码并未将消息床底出去，重定向不代参数
           //resp.sendRedirect(req.getContextPath()+"/login.jsp");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
