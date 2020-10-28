package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Flobby
 */
@WebServlet(name = "LastAccessServlet",urlPatterns = "/LastAccess")
public class LastAccessServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String lastAccessTime = null;
        Cookie[] cookies = request.getCookies();
        for (Cookie c:cookies){
            if ("LastAccessTime".equals(c.getName())){
                lastAccessTime = URLDecoder.decode(c.getValue(),"utf-8");
                break;
            }
        }
        if (lastAccessTime == null){
            out.println("首次访问本网页");
        }else {
            out.println("上次访问此网页的时间为："+lastAccessTime);
        }

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String now = df.format(LocalDateTime.now());
        Cookie cookie = new Cookie("LastAccessTime", URLEncoder.encode(now,"utf-8"));
        response.addCookie(cookie);
    }
}
