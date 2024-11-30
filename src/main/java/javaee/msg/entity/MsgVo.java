package javaee.msg.entity;

import lombok.Data;

import java.util.List;

@Data
public class MsgVo extends Msg {
    private List<Msg> replyList;
}
