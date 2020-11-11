package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.interfaces.RSAKey;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Flobby
 */
@WebServlet(name = "VoteServlet",urlPatterns = "/WebTask/vote")
public class VoteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public VoteServlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int total=0;
        Map map = null;
        String choice= request.getParameter("item");
        ServletContext servletContext2=request.getSession().getServletContext();
        if (servletContext2.getAttribute("result")!=null){
            map = (Map)servletContext2.getAttribute("result");
            map.put(choice,Integer.parseInt(map.get(choice).toString())+1);
            total = (Integer)servletContext2.getAttribute("total");
            total++;
        }else {
            String[] str = {"one","two","three","four","five"};
            map = new HashMap();
            for (int i = 0; i < str.length; i++){
                if (str[i].equals(choice)){
                    map.put(str[i],1);
                    total = 1;
                }else {
                    map.put(str[i],0);
                }
            }
        }
        servletContext2.setAttribute("result",map);
        servletContext2.setAttribute("total",total);
        RequestDispatcher rd = request.getRequestDispatcher("VoteResult.jsp");
        rd.forward(request,response);
    }
}
