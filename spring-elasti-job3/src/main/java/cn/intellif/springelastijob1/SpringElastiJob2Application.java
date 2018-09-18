package cn.intellif.springelastijob1;

import cn.intellif.springelastijob1.event.ApplicationFinishEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringElastiJob2Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext =SpringApplication.run(SpringElastiJob2Application.class, args);
		applicationContext.publishEvent(new ApplicationFinishEvent("finish"));

	}
}
