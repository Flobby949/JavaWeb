package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Flobby
 */
@WebServlet(name = "ELServlet",urlPatterns = "/JavaWebCourse/EL-jstl/EL")
public class ELServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer one =  Integer.parseInt(request.getParameter("one"));
        Integer two =  Integer.parseInt(request.getParameter("two"));

        request.setAttribute("one",one);
        request.setAttribute("two",two);

        RequestDispatcher rd = request.getRequestDispatcher("ELcalculation.jsp");
        rd.forward(request,response);
    }
}
