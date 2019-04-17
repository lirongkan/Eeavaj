package list;

import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletListDemo",value={"/list"})
public class ServletListDemo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   /*模拟接收了数据*/
    List<User> list =new ArrayList<>();
    list.add(new User("aaa",97,"111"));
    list.add(new User("bbb",98,"222"));
    list.add(new User("c",99,"333"));
    list.add(new User("d",100,"444"));
    list.add(new User("e",101,"555"));
    list.add(new User("f",102,"666"));
    /*(String name,Object o)*/
/*
    如果与都可以使用，建议使用最小的
*/
    request.setAttribute("list",list);
    request.getRequestDispatcher("/list.jsp").forward(request,response);
    }
}
