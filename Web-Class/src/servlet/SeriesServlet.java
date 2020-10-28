package servlet;

import webclass.beans.SeriesBean;

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
@WebServlet(name = "SeriesServlet",urlPatterns = "/JavaWebCourse/series")
public class SeriesServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SeriesBean seriesBean = new SeriesBean();
        request.setAttribute("seriesBean",seriesBean);
        double firstItem = Double.parseDouble(request.getParameter("firstItem"));
        double var = Double.parseDouble(request.getParameter("var"));
        int num = Integer.parseInt(request.getParameter("num"));
        seriesBean.setFirstItem(firstItem);
        seriesBean.setVar(var);
        seriesBean.setNum(num);
        seriesBean.setName("公差");
        //求和
        int n = 1;
        double sum = 0;
        double item = firstItem;
        while (n <= num){
            sum += item;
            item += var;
            n++;
        }
        seriesBean.setSum(sum);
        RequestDispatcher re = request.getRequestDispatcher("SeriesShow.jsp");
        re.forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SeriesBean seriesBean = new SeriesBean();
        request.setAttribute("seriesBean",seriesBean);
        double firstItem = Double.parseDouble(request.getParameter("firstItem"));
        double var = Double.parseDouble(request.getParameter("var"));
        int num = Integer.parseInt(request.getParameter("num"));
        seriesBean.setFirstItem(firstItem);
        seriesBean.setVar(var);
        seriesBean.setNum(num);
        seriesBean.setName("公比");
        //求和
        int n = 1;
        double sum = 0;
        double item = firstItem;
        while (n <= num){
            sum += item;
            item *= var;
            n++;
        }
        seriesBean.setSum(sum);
        RequestDispatcher re = request.getRequestDispatcher("SeriesShow.jsp");
        re.forward(request,response);
    }
}
