package javaee.msg.service.impl;

import javaee.msg.entity.Msg;
import javaee.msg.entity.MsgVo;
import javaee.msg.mapper.MsgMapper;
import javaee.msg.service.MsgService;
import javaee.msg.utitls.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.Collections;
import java.util.List;

public class MsgServiceImpl implements MsgService {
    @Override
    public List<MsgVo> pageList() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        MsgMapper mapper = sqlSession.getMapper(MsgMapper.class);
        return mapper.pageList();
    }

    @Override
    public void insert(Msg msg) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        MsgMapper mapper = sqlSession.getMapper(MsgMapper.class);
        mapper.insert(msg);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(String id) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        MsgMapper mapper = sqlSession.getMapper(MsgMapper.class);
        mapper.deleteByPrimaryKey(Integer.parseInt(id));
        sqlSession.commit();
        sqlSession.close();
    }
}
