package jdbcDemo.servlet;

import com.jspsmart.upload.File;
import com.jspsmart.upload.SmartUpload;
import jdbcDemo.util.TimeStamp;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Flobby
 */
@WebServlet(name = "SuServlet",urlPatterns = "/JavaWebCourse/Emp/suDo")
public class SuServlet extends HttpServlet {
    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //实例化上传组件
        SmartUpload su = new SmartUpload();
        //初始化上传操作
        su.initialize(this.getServletConfig(),request,response);
        //实现su限制
        su.setAllowedFilesList("jpg,png,bmp,gif,jpeg");
        //设定只能接收10MB之内的文件
        //su.setMaxFileSize(1024*1024*10);
        //上传准备
        su.upload();
        //获取常规请求参数
        String name = su.getRequest().getParameter("name");
        //获取上传文件
        System.out.println(su.getFiles().getCount());
        File file = su.getFiles().getFile(0);
        //获取上传文件的文件名
        String fileName = file.getFileName();
        System.out.println("fileName:"+fileName);
        //给文件重命名
          //获取文件后缀
            String ext = file.getFileExt();
          //实例化时间戳
            TimeStamp ts = new TimeStamp();
          //拼凑文件名
            fileName = ts.getTimeStamp()+"."+ext;
        System.out.println(fileName);
        //将上传文件保存到指定文件夹---upload
        //su.save("/upload");
        file.saveAs(this.getServletContext().getRealPath("/")+"upload/"+fileName);
        //将数据保存request范围
        request.setAttribute("name",name);
        request.setAttribute("avatar",fileName);
        //服务器跳转
        request.getRequestDispatcher("SuShow.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
