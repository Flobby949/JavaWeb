package filters;

import webclass.java.UserInfo;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.sql.SQLException;

/**
 * @author Flobby
 */
@WebFilter(filterName = "IndexFilter",urlPatterns = "/UserIndexServlet")
public class IndexFilter implements Filter {
    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        Cookie[] cookies = request.getCookies();
        String auto = null;
        for (int i = 0; cookies != null&&i < cookies.length; i++){
            if ("auto".equals(cookies[i].getName())){
                auto = cookies[i].getValue();
                break;
            }
        }
        if (auto != null){
            String[] parts = auto.split("-");
            String username = parts[0];
            String password = parts[1];
            if ("123".equals(password)){
                UserInfo userInfo = new UserInfo();
                userInfo.setAccount(username);
                userInfo.setPassword(password);
                request.getSession().setAttribute("user",userInfo);
            }
        }

        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
