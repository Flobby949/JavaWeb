package jdbcDemo.servlet;

import jdbcDemo.bean.Emp;
import jdbcDemo.dao.EmpDao;
import jdbcDemo.dao.impl.EmpImpl;
import jdbcDemo.factory.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Flobby
 */
@WebServlet(name = "EmpServlet", urlPatterns = {"/JavaWebCourse/empShowAll","/JavaWebCourse/do_insert"})
public class EmpServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Emp> list= ServiceFactory.getEmpServiceInstance().searchAll();
            request.setAttribute("empList",list);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        String path="showEmp.jsp";
        String path = "showPages.jsp";
        request.getRequestDispatcher(path).forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}

