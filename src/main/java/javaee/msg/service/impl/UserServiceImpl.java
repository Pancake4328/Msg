package javaee.msg.service.impl;

import javaee.msg.entity.User;
import javaee.msg.mapper.UserMapper;
import javaee.msg.service.UserService;
import javaee.msg.utitls.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class UserServiceImpl implements UserService {
    @Override
    public User login(String name, String password) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.login(name,password );
    }
}
