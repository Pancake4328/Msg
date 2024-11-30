package javaee.msg.controller;

import javaee.msg.entity.User;
import javaee.msg.service.UserService;
import javaee.msg.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//111
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl() ;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String password = req.getParameter("password");


        User user = userService.login(name,password);
        if(user != null){
            req.getSession().setAttribute("user", user);
            resp.sendRedirect("/list");
        }else {
            req.setAttribute("error","账号或密码错误");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }

        //super.service(req, resp);
    }
}
