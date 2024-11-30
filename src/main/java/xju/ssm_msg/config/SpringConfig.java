package xju.ssm_msg.config;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan({"xju.ssm_msg.service","xju.ssm_msg.mapper"})
@EnableAspectJAutoProxy
@EnableTransactionManagement
@Import({DataSourceConfig.class,MybatisConfig.class})
public class SpringConfig {

    //事务管理器
    @Bean
    public TransactionManager transactionManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        return dataSourceTransactionManager;
    }
}
