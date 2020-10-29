package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author Flobby
 */
@WebServlet(name = "UserLayoutServlet",urlPatterns = "/layoutServlet")
public class UserLayoutServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
//      删除指定用户
        session.removeAttribute("user");
//      强制无效
//      session.invalidate();

//       清除cookie
        Cookie cookie = new Cookie("auto","msg");
        cookie.setPath(request.getContextPath());
        cookie.setMaxAge(0);
        response.addCookie(cookie);
//      返回登录界面
        response.sendRedirect("/Html/logIn.html");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
