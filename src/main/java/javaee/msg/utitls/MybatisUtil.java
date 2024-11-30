package javaee.msg.utitls;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        InputStream inputStream=null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public static SqlSession getSqlSession() {

        return sqlSessionFactory.openSession();
    };
}
