package com.mj;

import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.mj.service.FileHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
@Slf4j
public class LambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaApplication.class, args);
	}


	@Autowired
	private FileHandler fileHandler;

	@Bean
	public Function<S3Event,String> reverse() {

		log.info("Trigger File Handler Service");
		return s3event -> fileHandler.csvHandler(s3event);
	}

}
