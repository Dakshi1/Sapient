package com.ps.cfg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.ps.dao.DummyProductDao;
import com.ps.dao.JdbcProductDao;
import com.ps.dao.ProductDao;

@Configuration
@PropertySource({"classpath:jdbc-info.properties"})
@ComponentScan(basePackages = {"com.ps.dao"})
public class AppConif1 {

	@Value("${jdbc.driver_class_name}")
	private String driver;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String user;
	@Value("${jdbc.password}")
	private String password; 
	
	@Bean
	public ProductDao jdbdDao() {

		return new JdbcProductDao(driver, url, user, password);
	}

	@Bean
	public ProductDao dummyDao() {

		return new DummyProductDao();
	}
}
