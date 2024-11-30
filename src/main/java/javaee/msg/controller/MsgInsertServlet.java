package javaee.msg.controller;

import javaee.msg.entity.Msg;
import javaee.msg.service.MsgService;
import javaee.msg.service.impl.MsgServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/insert")
public class MsgInsertServlet extends HttpServlet {
    private MsgService msgService = new MsgServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String nickname = req.getParameter("Books_Name");
        String text = req.getParameter("Books_Info");
        String qq = req.getParameter("Books_Qq");
        String email = req.getParameter("Books_Mail");
        String replyId = req.getParameter("replyId");
        Msg msg = new Msg();
        msg.setNickname(nickname)
                .setText(text)
                .setQq(qq)
                .setEmail(email)
                .setReplyId(Integer.parseInt(replyId))
                .setCreateTime(new Date());
        msgService.insert(msg);
        resp.sendRedirect("/list");



    }
}
