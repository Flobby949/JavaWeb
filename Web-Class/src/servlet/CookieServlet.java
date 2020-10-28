package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Flobby
 */
@WebServlet(name = "CookieServlet",urlPatterns = "/getCookie")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        Cookie[] cookies = request.getCookies();
 /*
        for (Cookie c : cookies){
            out.println(c.getName()+"------->"+c.getValue());
        }
        */

 //Lambda表达式
        Arrays.asList(cookies).forEach(
                c -> out.println(c.getName()+"------->"+c.getValue())
        );

        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        out.println("\nlist遍历法一");
        list.forEach(c->out.println(c));
        out.println("\nlist遍历法二");
        list.forEach(out::println);

        Cookie cookie01 = new Cookie("soft","software1921");
        cookie01.setMaxAge(2);
        Cookie cookie02 = new Cookie("NIIT","南工");
        cookie02.setMaxAge(5);
        response.addCookie(cookie01);
        response.addCookie(cookie02);

        HttpSession session = request.getSession();
        out.println("sessionId:  "+session.getId());

        out.flush();
        out.close();
    }
}
