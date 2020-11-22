package com.springcloud.kubernetes.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.springcloud.kubernetes.WelcomeConfig;

@Component
public class SchedulerConfig {
    
	@Autowired
	WelcomeConfig config;
	@Autowired
	RestTemplate template;
	@Scheduled(fixedDelay = 3000)
	public void runConfig() {
      System.out.println("Message: "+config.getMessage());
      
      String url="http://docker-springboot-service:8086/docker";
      ResponseEntity<String> response= template.getForEntity(url, String.class);
      System.out.println("resturning service descovery response: " + response.getBody());
	}
}
