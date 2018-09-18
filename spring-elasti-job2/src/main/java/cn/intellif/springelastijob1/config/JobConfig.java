package cn.intellif.springelastijob1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = "classpath:schedulr-job.xml")
public class JobConfig {
}
