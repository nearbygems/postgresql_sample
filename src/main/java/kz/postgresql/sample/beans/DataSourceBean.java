package kz.postgresql.sample.beans;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class DataSourceBean {

  @Bean
  public DataSource dataSource() {

    var config = new HikariConfig();
    config.setDriverClassName("org.postgresql.Driver");

    var url = "jdbc:postgresql://localhost:1026/sample";
    config.setJdbcUrl(url);
    config.setUsername("bergen");
    config.setPassword("111");

    return new HikariDataSource(config);
  }

}
