package javaee.msg.service;

import javaee.msg.entity.Msg;
import javaee.msg.entity.MsgVo;

import java.util.List;

public interface MsgService {
    List<MsgVo> pageList();

    void insert(Msg msg);

    void delete(String id);
}
