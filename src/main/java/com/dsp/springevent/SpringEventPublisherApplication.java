package com.dsp.springevent;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dsp.springevent.event.CustomSpringEventPublisher;

@SpringBootApplication
public class SpringEventPublisherApplication {

	@Autowired
	public CustomSpringEventPublisher publisher;


	public static void main(String[] args) {
		SpringApplication.run(SpringEventPublisherApplication.class, args);
	}

	@PostConstruct
	public void init() {
		System.out.println("Calling starter.init");
		publisher.doStuffAndPublishAnEvent("PUBLISHING EVENT PRADEEP EVENT");
	}
}

