package javaee.msg.controller;

import javaee.msg.service.MsgService;
import javaee.msg.service.impl.MsgServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class MsgDelServlet extends HttpServlet {
    private MsgService msgService = new MsgServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        msgService.delete(id);
        resp.sendRedirect("/list");
    }
}
