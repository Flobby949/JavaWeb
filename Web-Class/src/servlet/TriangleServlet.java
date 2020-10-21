package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.Math.sqrt;

/**
 * @author Flobby
 */
@WebServlet(name = "TriangleServlet",urlPatterns = "/WebTask/triangle")
public class TriangleServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        double area = 0;
        Integer edge1 = Integer.parseInt(request.getParameter("edgeOne"));
        Integer edge2 = Integer.parseInt(request.getParameter("edgeTwo"));
        Integer edge3 = Integer.parseInt(request.getParameter("edgeThree"));
        if (edge1+edge2>edge3&edge1+edge3>edge2&&edge2+edge3>edge1){
            double p=(double)(edge1+edge2+edge3)/2;
            area=sqrt(p*(p-edge1)*(p-edge2)*(p-edge3));
            request.setAttribute("area",area);
            RequestDispatcher rd = request.getRequestDispatcher("ShowArea.jsp");
            rd.forward(request,response);
        }else {
            RequestDispatcher rd = request.getRequestDispatcher("errorTri.jsp");
            rd.forward(request,response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
