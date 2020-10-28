package servlet;

import webclass.java.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Flobby
 */
@WebServlet(name = "UserInfoServlet",urlPatterns = "/UserIndexServlet")
public class UserIndexServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        UserInfo user = (UserInfo)session.getAttribute("user");
        if (user == null){
            out.println("您还没有登录,点击<a href='/Html/logIn.html'>这里</a>登录");
        }else {
            out.println("欢迎您，"+user.getAccount()+"!");
            out.println("<a href='/layoutServlet'>退出</a>");
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
