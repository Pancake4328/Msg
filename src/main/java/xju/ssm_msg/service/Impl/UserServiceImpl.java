package xju.ssm_msg.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xju.ssm_msg.entity.User;
import xju.ssm_msg.mapper.UserMapper;
import xju.ssm_msg.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {



        return userMapper.login(user);
    }
}
