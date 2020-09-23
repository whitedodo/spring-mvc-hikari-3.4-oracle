/*
 * 	Subject: Spring MVC with Hikari 4.3 and Oracle 19 연동하기
 * 	Filename: DataSource.java
 * 	Create Date: 2020-09-23
 * 	Description: 
 * 	1. 
 * 	2
 * 
 */

package com.springMVC.web.persistance;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;

import java.sql.Connection;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DataSource {

	private static final Logger logger = LoggerFactory.getLogger(DataSource.class);

    private static String CLASSNAME;
    private static String JDBC_URL;
    private static String USERNAME;
    private static String PASSWORD;
    private static String CACHE_PREP_STMTS;
    private static String PREP_STMT_CACHE_SIZE;
    private static String PREP_STMT_CACHE_SQL_LIMIT;
			
    private static HikariDataSource ds;
    
	/*
	(자바 방식)
    private static HikariConfig config = new HikariConfig();
    
    static {
    	config.setDriverClassName("oracle.jdbc.OracleDriver");
        config.setJdbcUrl( "jdbc:oracle:thin:@localhost:1521:orcl" );
        config.setUsername( "사용자계정명" );
        config.setPassword( "비밀번호" );
        
        config.addDataSourceProperty( "cachePrepStmts" , "true" );
        config.addDataSourceProperty( "prepStmtCacheSize" , "250" );
        config.addDataSourceProperty( "prepStmtCacheSqlLimit" , "2048" );
        ds = new HikariDataSource( config );
    }
    */
    
    private HikariConfig config;
    
    public DataSource() {
    	
    	InputStream inputStream;
    	config = new HikariConfig();
    	
    	String resource = "db.properties";
        Properties properties = new Properties();
        
        try {
        	inputStream = getClass().getClassLoader().getResourceAsStream(resource);
            properties.load(inputStream);
            System.out.println(properties.getProperty("jdbcUrl"));
            System.out.println(properties.getProperty("dataSourceClassName"));
            
            
            CLASSNAME = properties.getProperty("dataSourceClassName");
            JDBC_URL = properties.getProperty("jdbcUrl");
            USERNAME = properties.getProperty("dataSource.user");
            PASSWORD = properties.getProperty("dataSource.password");
            
            CACHE_PREP_STMTS = properties.getProperty("cachePrepStmts");
            PREP_STMT_CACHE_SIZE = properties.getProperty("prepStmtCacheSize");
            PREP_STMT_CACHE_SQL_LIMIT = properties.getProperty("prepStmtCacheSqlLimit");

            config.setDriverClassName(CLASSNAME);
            config.setJdbcUrl( JDBC_URL );
            config.setUsername( USERNAME );
            config.setPassword( PASSWORD );
            
            config.addDataSourceProperty( "cachePrepStmts" , CACHE_PREP_STMTS );
            config.addDataSourceProperty( "prepStmtCacheSize" , PREP_STMT_CACHE_SIZE );
            config.addDataSourceProperty( "prepStmtCacheSqlLimit" , PREP_STMT_CACHE_SQL_LIMIT );
            
            ds = new HikariDataSource( config );
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Connection getConnection() throws SQLException {

        return ds.getConnection();
    }
}
