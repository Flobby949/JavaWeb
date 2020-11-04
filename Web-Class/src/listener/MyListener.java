package listener;

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
public class MyListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    // Public constructor is required by servlet spec
    public MyListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("application对象被创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("application对象被销毁");
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
        String sessionId = se.getSession().getId();
        System.out.println("session对象被创建，sessionID："+sessionId);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        /* Session is destroyed. */
        se.getSession().invalidate();
        System.out.println("session对象被销毁");
    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation
    // -------------------------------------------------------

    @Override
    public void attributeAdded(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute 
         is added to a session.
      */
      String name = sbe.getName();
      System.out.println("session范围对象被创建："+name+"="+sbe.getValue());

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute
         is removed from a session.
      */
        String name = sbe.getName();
        System.out.println("session范围对象被修改："+name+"="
                +sbe.getSession().getAttribute(name));
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent sbe) {
      /* This method is invoked when an attribute
         is replaced in a session.
      */
        String name = sbe.getName();
        System.out.println("session范围对象被销毁："+name);
    }
}
