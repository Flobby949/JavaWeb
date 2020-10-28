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
@WebServlet(name = "LogInDoServlet",urlPatterns ="/logInDo")
public class LogInDoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        //获取验证码
        String rand = (String) session.getAttribute("verifyCode");
        //获取表单信息
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        String verifyCode = request.getParameter("verifyCode");

        if ("123".equals(password)&&rand.equals(verifyCode)){
            UserInfo user = new UserInfo(account,password);
            session.setAttribute("user",user);
            response.sendRedirect("/UserIndexServlet");
        }else {
            out.println("密码或验证码错误，请重新登录");
            out.print("<a href='/Html/logIn.html'>登录</a>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
