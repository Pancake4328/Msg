package javaee.msg.mapper;

import java.util.List;
import javaee.msg.entity.Msg;
import javaee.msg.entity.MsgVo;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface MsgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg
     *
     * @mbg.generated Tue Nov 26 18:34:36 CST 2024
     */
    int insert(Msg row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg
     *
     * @mbg.generated Tue Nov 26 18:34:36 CST 2024
     */
    List<Msg> selectAll();

    @Select("SELECT * FROM msg WHERE reply_id is NULL ORDER BY create_time DESC")
    @Results({
            @Result(property = "id",column = "id",id = true),
            @Result(property = "nickname",column = "nickname"),
            @Result(property = "qq",column = "qq"),
            @Result(property = "email",column = "email"),
            @Result(property = "text",column = "text"),
            @Result(property = "replyId",column = "reply_id"),
            @Result(property = "createTime",column = "create_time"),
            @Result(property = "replyList",
                    column = "id",
                    javaType = List.class,
                    many = @Many(select = "javaee.msg.mapper.MsgMapper.selectByReplyId"))

    })
    List<MsgVo> pageList();
    @Select("SELECT * FROM msg WHERE reply_id = #{replyId}")
    List<Msg> selectByReplyId(int replyId);

    int deleteByPrimaryKey(Integer id);
}