package config;

import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = {"dao","service"})
@EnableTransactionManagement
public class AppConfig {
	
	  @Bean
	    public DataSource dataSource() {

	        DriverManagerDataSource dataSource =
	                new DriverManagerDataSource();

	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

	        dataSource.setUrl("jdbc:mysql://localhost:3306/employee");

	        dataSource.setUsername("root");

	        dataSource.setPassword("root");

	        return dataSource;
	    }

	    @Bean
	    public JdbcTemplate jdbcTemplate() {

	        JdbcTemplate jdbcTemplate =
	                new JdbcTemplate();

	        jdbcTemplate.setDataSource(dataSource());

	        return jdbcTemplate;
	    }
	    
	    @Bean
	    public PlatformTransactionManager transactionManager(
	            DataSource dataSource) {

	        return new DataSourceTransactionManager(dataSource);

	    }

}
