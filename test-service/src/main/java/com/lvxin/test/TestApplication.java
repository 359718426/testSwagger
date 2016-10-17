package com.lvxin.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude = {SessionAutoConfiguration.class, DataSourceAutoConfiguration.class, RedisAutoConfiguration.class})
@ImportResource({"classpath:application-context.xml"})
public class TestApplication  implements EmbeddedServletContainerCustomizer {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class,args).registerShutdownHook();
    }

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		// TODO Auto-generated method stub
		
	}
}
