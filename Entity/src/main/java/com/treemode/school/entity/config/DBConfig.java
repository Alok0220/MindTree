/*

 * Copyright (C) Joffer Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Alok Dethe <dethealok@gmail.com>, <det.alex0110@gmail.com>, July 2020

 */
package com.treemode.school.entity.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author alokdethe
 */
@Configuration
public class DBConfig {
    
    private static HikariDataSource dataSource = null;
    private static HikariConfig config = new HikariConfig();
    
    
    static {
        
    }
    
    public DBConfig(){
        
        
    }
    
    @Bean
    public HikariDataSource DatabaseConfig(){
        
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.type(HikariDataSource.class);
        dataSourceBuilder.username("root");
        dataSourceBuilder.password("Have&$&$0921");
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/entitydb");
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        
        return (HikariDataSource) dataSourceBuilder.build();
    }
    
    public Connection getConnection(){
        return null;
    }
}
