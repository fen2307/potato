package com.seriousStuff;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class Config {

    @Value("${jdbc.url}")
    private  String jdbcUrl;

    @Value("${jdbc.password}")
    private  String jdbcPassword;

    @Value("${jdbc.username}")
    private  String jdbcUsername;

    @Value("${jdbc.driver-class-name}")
    private  String jdbcDriver;


    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(jdbcDriver);
        dataSource.setUrl(jdbcUrl);
        dataSource.setUsername( jdbcUsername );
        dataSource.setPassword( jdbcPassword );
        return dataSource;
    }


}
