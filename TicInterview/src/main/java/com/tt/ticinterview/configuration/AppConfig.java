/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.configuration;

import com.tt.ticinterview.model.manager.InterviewManager;
import com.tt.ticinterview.model.manager.InterviewerManager;
import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *,
        "com.tt.ticinterview.model.dao"
 * @author pnaca
 */
@Configuration
@ComponentScan(basePackages = {"com.tt.ticinterview","com.tt.ticinterview.model.dao","com.tt.ticinterview.model.manager"})
@EnableWebMvc

@EnableTransactionManagement
public class AppConfig {
    @Bean(name = "dataSource")
    public DriverManagerDataSource getDriverManagerDatasource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
        dataSource.setPassword("root");
        dataSource.setUrl("jdbc:mysql://localhost:3307/tt");
        dataSource.setUsername("root");
        return dataSource;
    }

    @Bean(name = "myEmf")
    public LocalContainerEntityManagerFactoryBean getLocalContainerEntityManagerFactoryBean() {
        LocalContainerEntityManagerFactoryBean local = new LocalContainerEntityManagerFactoryBean();
        local.setDataSource(getDriverManagerDatasource());
        local.setPackagesToScan("com.tt.ticinterview.beans");
//        Properties props = new Properties();
//        props.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
//        props.put("hibernate.hbm2ddl.auto", "update");
        local.setJpaProperties(getHibernateProperties());
    
        local.setJpaVendorAdapter(getHibernateJpaVendorAdapter());

        return local;
    }

    @Bean(name = "vendorAdapter")
    public HibernateJpaVendorAdapter getHibernateJpaVendorAdapter() {
        HibernateJpaVendorAdapter vendor = new HibernateJpaVendorAdapter();
        return vendor;
    }

    @Bean(name = "transactionManager")
    public JpaTransactionManager getJpaTransactionManager() {
        JpaTransactionManager tm = new JpaTransactionManager();
        tm.setEntityManagerFactory(getLocalContainerEntityManagerFactoryBean().getNativeEntityManagerFactory());
        return tm;
    }
     private Properties getHibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.hbm2ddl.auto", "update");
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        return properties;
    }
     
//     @Bean
//     public InterviewerManager I(){
//         return new InterviewerManager();
//     }
}
