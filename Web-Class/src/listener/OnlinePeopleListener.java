package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @author Flobby
 */
@WebListener()
public class OnlinePeopleListener implements HttpSessionListener{
    private Integer count = 0;
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        count++;
        ServletContext app = se.getSession().getServletContext();
        app.setAttribute("count",count);
        System.out.println("当前在线人数："+app.getAttribute("count"));
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        count--;
        ServletContext app = se.getSession().getServletContext();
        app.setAttribute("count",count);
        System.out.println("当前在线人数："+app.getAttribute("count"));
    }
}
