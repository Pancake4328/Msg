package javaee.msg.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import javaee.msg.entity.MsgVo;
import javaee.msg.service.MsgService;
import javaee.msg.service.impl.MsgServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list")
public class MsgListServlet extends HttpServlet {

    private MsgService msgService = new MsgServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
//        String nickname = req.getParameter("Books_Name");
//        String text = req.getParameter("Books_Info");
//        String qq = req.getParameter("Books_Qq");
//        String email = req.getParameter("Books_Mail");
        String pageNoStr = req.getParameter("pageNo");
        String pageSizeStr = req.getParameter("pageSize");
        Integer pageNo = pageNoStr == null ? 1 : Integer.parseInt(pageNoStr);
        Integer pageSize = pageSizeStr == null ? 5 : Integer.parseInt(pageSizeStr);
        PageHelper.startPage(pageNo, pageSize);
        List<MsgVo> msgList =  msgService.pageList();
        PageInfo<MsgVo> pageInfo = new PageInfo<>(msgList);
        req.setAttribute("pageInfo", pageInfo);
        req.setAttribute("msgList", msgList);
        req.getRequestDispatcher("/pages/msg.jsp").forward(req, resp);


    }
}
