package life;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletLifeDemo2",value="/life2")
public class ServletLifeDemo2 extends HttpServlet {
    /*构造方法-》init--》service--》destroy*/
   public ServletLifeDemo2(){
    System.out.println("life2为什么会被创建？");
    System.out.println("life2为什么会被创建？");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("1212S");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
