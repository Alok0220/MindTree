/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.treemode.school.entity.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
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
    
    public Connection getConnection(){
        return null;
    }
}
