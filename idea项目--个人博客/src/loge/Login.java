package loge;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setHeader("content-type","text/html;charset=utf-8");
        String name = request.getParameter("uname");
        String pass = request.getParameter("upass");

        boolean b = UserData.userLogin(name, pass);  //b是 true 登陆成功      否则失败

        if (b==true){
            request.setAttribute("user",name);
            request.getRequestDispatcher("blog.jsp").forward(request,response);
        }else{

            request.setAttribute("mess","登陆失败");
            request.getRequestDispatcher("index.jsp").forward(request,response);

        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
