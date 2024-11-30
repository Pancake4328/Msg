import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xju.ssm_msg.config.SpringConfig;

import javax.sql.DataSource;

@ContextConfiguration(classes = SpringConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class Test {

    @Autowired
    private DataSource dataSource;

    @org.junit.Test
    public void test() {}
}
