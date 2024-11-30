package xju.ssm_msg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import xju.ssm_msg.entity.User;
import xju.ssm_msg.service.UserService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("login")
    public String login(User user , HttpSession session) {
        User loginUser = userService.login(user);
        if (loginUser != null) {
            session.setAttribute("user", loginUser);
            return "redirect:/ ";
        }
        else   


        return "login";
    }

}
