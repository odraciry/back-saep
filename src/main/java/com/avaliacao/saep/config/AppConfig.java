package com.avaliacao.saep.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer{
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dt = new DriverManagerDataSource();
		dt.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dt.setUrl("jdbc:mysql://localhost:3306/provaSaep");
		dt.setUsername("root");
		dt.setPassword("root");
		return dt;
	}
	@Bean
	public JpaVendorAdapter jpaVendorAdapter () {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.MYSQL);
		adapter.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
		adapter.setPrepareConnection(true);
		adapter.setGenerateDdl(true);
		adapter.setShowSql(true);
		return adapter;
	}
	
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedMethods("GET", "POST", "DELETE", "PUT");
	}
}
