package jdbcDemo.servlet;

import jdbcDemo.bean.Emp;
import jdbcDemo.bean.User;
import jdbcDemo.factory.ServiceFactory;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author Flobby
 */
@WebServlet(name = "EmpServlet", urlPatterns = {"/JavaWebCourse/Emp/empServlet"})
public class EmpServlet extends HttpServlet {
    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("showAll".equals(action)){
            showAll(request,response);
        }else if ("insert".equals(action)){
            insert(request,response);
        }else if ("deleteById".equals(action)){
            deleteById(request,response);
        }else if ("update".equals(action)){
            update(request,response);
        }else if ("searchByName".equals(action)){
            searchByName(request,response);
        }else if ("searchById".equals(action)){
            searchById(request,response);
        }else if ("login".equals(action)){
            logIn(request,response);
        }else if ("register".equals(action)){
            register(request,response);
        }
    }

    protected void showAll(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        try {
            List<Emp> emplist = ServiceFactory.getEmpServiceInstance().searchAll();
            session.setAttribute("emplist",emplist);
            String path = "showPages.jsp";
            response.sendRedirect(path);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("出错了");
        }
    }

    protected void insert(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String job = request.getParameter("job");
        double sal = Double.parseDouble(request.getParameter("sal"));
        Emp emp = new Emp(name,job,sal);
        PrintWriter out = response.getWriter();
        try {
            ServiceFactory.getEmpServiceInstance().insert(emp);
            out.println("<script language=javascript>" +
                    "alert('添加成功');" +
                    "window.location.href='EmpIndex.jsp';" +
                    "</script>");
        } catch (Exception e) {
            e.printStackTrace();
            out.println("<script language=javascript>" +
                    "alert('添加失败');" +
                    "window.location.href='EmpIndex.jsp';" +
                    "</script>");
        }
    }

    protected void deleteById(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        PrintWriter out = response.getWriter();
        try {
            ServiceFactory.getEmpServiceInstance().deleteById(id);
            out.println("<script language=javascript>" +
                    "alert('删除成功');" +
                    "window.location.href='EmpIndex.jsp';" +
                    "</script>");
        } catch (Exception e) {
            e.printStackTrace();
            out.println("<script language=javascript>" +
                    "alert('删除失败');" +
                    "window.location.href='EmpIndex.jsp';" +
                    "</script>");
        }
    }

    protected void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String job = request.getParameter("job");
        double sal = Double.parseDouble(request.getParameter("sal"));
        int id = Integer.parseInt(request.getParameter("id"));
        Emp emp = new Emp(id,name,job,sal);
        try {
            ServiceFactory.getEmpServiceInstance().updateById(id,emp);
            response.getWriter().println("<script language=javascript>" +
                    "alert('修改成功');" +
                    "window.location.href='EmpIndex.jsp';" +
                    "</script>");
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("<script language=javascript>" +
                    "alert('修改失败');" +
                    "window.location.href='EmpIndex.jsp';" +
                    "</script>");
        }
    }

    protected void searchByName(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        String name = request.getParameter("name");
        try {
            List<Emp> emp = ServiceFactory.getEmpServiceInstance().searchByName(name);
            session.setAttribute("emplist",emp);
            if (!emp.isEmpty()){
                String path = "showPages.jsp";
                response.sendRedirect(path);
            }else {
                response.getWriter().println("<script language=javascript>" +
                        "alert('查无此名称');" +
                        "window.location.href='EmpIndex.jsp';" +
                        "</script>");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("出错了");
        }
    }

    protected void searchById(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        String idStr=request.getParameter("id");
        int id=Integer.parseInt(idStr.trim());
        try {
            Emp emp = ServiceFactory.getEmpServiceInstance().searchById(id);
            session.setAttribute("emp",emp);
            if (emp!=null){
                String path = "SearchPages.jsp";
                response.sendRedirect(path);
            }else {
                response.getWriter().println("<script language=javascript>" +
                        "alert('查无此编号');" +
                        "window.location.href='EmpIndex.jsp';" +
                        "</script>");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("出错了");
        }
    }

    protected void logIn(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        try {
            boolean flag = ServiceFactory.getUserServiceInstance().getUser(name,password);
            String avatar = ServiceFactory.getUserServiceInstance().getHead(name);
            request.getSession().setAttribute("avatar",avatar);
            if (flag){
                response.getWriter().println("<script language=javascript>" +
                        "alert('登录成功');" +
                        "window.location.href='EmpIndex.jsp';" +
                        "</script>");
            }else {
                response.getWriter().println("<script language=javascript>" +
                        "alert('账号错误，请重新登录或注册');" +
                        "window.location.href='LogIn.jsp';" +
                        "</script>");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }
    }

    protected void register(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String avatar = request.getParameter("image");
        String name = request.getParameter("username");
        String pw1 = request.getParameter("pw1");
        String pw2 = request.getParameter("pw2");
        if (pw1.equals(pw2)){
            User user = new User(avatar,name,pw1);
            ServiceFactory.getUserServiceInstance().addUser(user);
            request.getSession().setAttribute("avatar",avatar);
            response.getWriter().println("<script language=javascript>" +
                    "alert('注册成功');" +
//                    "window.location.href='EmpIndex.jsp';" +
                    "</script>");
            request.getRequestDispatcher("EmpIndex.jsp").forward(request,response);
        }else {
            response.getWriter().println("<script language=javascript>" +
                    "alert('注册失败，两次密码不同');" +
                    "window.location.href='Register.jsp';" +
                    "</script>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}

