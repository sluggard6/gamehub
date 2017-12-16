package xyz.sluggard.thingshub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.ContextClosedEvent;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("xyz.sluggard.thingshub")
@MapperScan("xyz.sluggard.thingshub.dao")
@Slf4j
public class ThingsApplication {
	
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext cac = SpringApplication.run(ThingsApplication.class, args);
		cac.addApplicationListener(new ApplicationListener<ContextClosedEvent>() {

			@Override
			public void onApplicationEvent(ContextClosedEvent event) {
				log.info("context closed");
			}
		});
    }

}
