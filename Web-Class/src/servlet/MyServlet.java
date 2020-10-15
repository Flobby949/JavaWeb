package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Flobby
 */
@WebServlet(name = "MyServlet",description = "这是第一个servlet代码",
        urlPatterns = {"/aaa","/bbb"},loadOnStartup = 1,
        initParams = {@WebInitParam(name = "sbYyf", value = "sb洋芋饭",
        description = "laLaLa")}
        )
public class MyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        PrintWriter out = response.getWriter();
        out.println(id);
        out.flush();
        out.close();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        /*
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type","text/html;charset=utf-8");
        */

        ServletConfig config = this.getServletConfig();
        String param = config.getInitParameter("sbYyf");
        ServletContext context = config.getServletContext();

//        String paramContent = config.getInitParameter("email");
        String paramContent = this.getInitParameter("email");

        String path = context.getRealPath("/");
        String servletName = config.getServletName();

        PrintWriter out = response.getWriter();
        out.println("爱的色放纳斯卡的发挥了客户");
        out.println("参数："+param);
        out.println("路径"+path);
        out.println("名字"+servletName);
        out.flush();
        out.close();
    }
}
