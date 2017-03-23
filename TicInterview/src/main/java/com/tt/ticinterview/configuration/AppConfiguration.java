package com.tt.ticinterview.configuration;

import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import org.hibernate.Hibernate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Configuración de la appSpring
 * 
 * @author -PNM
 * @since 0.1
 * 
 */


//@Configuration
//@ComponentScan(basePackages="com.tt.ticinterview")
//@EnableWebMvc
//@EnableTransactionManagement

public class AppConfiguration{

    /*
    //${jdbc.driverClassName}
    @Value("${jdbc.driverClassName}")     private String driverClassName;
    @Value("${jdbc:mysql://localhost:3306/test_interview}")                 private String url;
    @Value("${root}")             private String username;
    @Value("${root}")             private String password;
    
    @Value("${org.hibernate.dialect.MySQL5Dialect}")         private String hibernateDialect;
    @Value("${true}")     private String hibernateShowSql;
    @Value("${create-drop}") private String hibernateHbm2ddlAuto;
    */    
     
    /**
     * Configuracion del datasource
     * 
     * @return Datasource
     */
    @Bean    
    public DriverManagerDataSource getDataSource()
    {
        DriverManagerDataSource ds = new DriverManagerDataSource();        
        ds.setDriverClassName("jdbc.driverClassName");
        ds.setUrl("jdbc:mysql://localhost:3306/test_interview");
        ds.setUsername("root");
        ds.setPassword("root");        
        return  ds;
    }
    /**
     * Local container
     * @return 
     */
    
    @Bean
    public LocalContainerEntityManagerFactoryBean getEntityManager(){
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(getDataSource());
        em.setPackagesToScan("com.tt.ticinterview.beans");
        em.setJpaVendorAdapter(getVendorAdapter());
        em.setJpaProperties(getHibernateProperties());
        
       
        return em;
    }
    /**
     * vendor adapter
     * @return 
     */        
    @Bean()
    public HibernateJpaVendorAdapter getVendorAdapter(){
        return new HibernateJpaVendorAdapter();
    }
      /**
     * Propiedades de la conexión hibernate
     * 
     * @return Datasource
     */
    
    @Bean
    public Properties getHibernateProperties()
    {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.hbm2ddl.auto", "update");
        
        return properties;
    }
    
    /**
     * Transaction manager
     */
    @Bean
    public JpaTransactionManager getTransactionManager(){
        JpaTransactionManager tm = new JpaTransactionManager();
        tm.setEntityManagerFactory((EntityManagerFactory) getEntityManager());
        
        return tm;
    }
    /**
     * View Resolver
     * @return 
     */
    
     @Bean(name = "ViewResolver")
    public ViewResolver getViewResolver()
    {
       InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
