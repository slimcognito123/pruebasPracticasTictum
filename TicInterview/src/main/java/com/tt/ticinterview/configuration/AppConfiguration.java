package com.tt.ticinterview.configuration;

import java.util.Properties;
import javax.activation.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Configuración de la appSpring
 * 
 * @author -PNM
 * @since 0.1
 * 
 */


@Configuration
@ComponentScan(basePackages="com.tt.ticinterview")
@EnableWebMvc
@EnableTransactionManagement
public class AppConfiguration{

    //${jdbc.driverClassName}
    @Value("${jdbc.driverClassName}")     private String driverClassName;
    @Value("${jdbc:mysql://localhost:3306/test_interview}")                 private String url;
    @Value("${root}")             private String username;
    @Value("${root}")             private String password;
    
    @Value("${hibernate.dialect}")         private String hibernateDialect;
    @Value("${hibernate.show_sql}")     private String hibernateShowSql;
    @Value("${hibernate.hbm2ddl.auto}") private String hibernateHbm2ddlAuto;
        
     
    /**
     * Configuracion del datasource
     * 
     * @return Datasource
     */
    @Bean    
    public DataSource getDataSource()
    {
        DriverManagerDataSource ds = new DriverManagerDataSource();        
        ds.setDriverClassName(driverClassName);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);        
        return (DataSource) ds;
    }
    
    
    @Bean
    public Properties getHibernateProperties()
    {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", hibernateDialect);
        properties.put("hibernate.show_sql", hibernateShowSql);
        properties.put("hibernate.hbm2ddl.auto", hibernateHbm2ddlAuto);
        
        return properties;
    }
}
