package com.shopping.mall;

import com.shopping.mall.config.ConstructorProperties;
import com.shopping.mall.util.ServiceDefine;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;
import java.util.UUID;

@Slf4j
@SpringBootApplication
@EnableConfigurationProperties(value = { ConstructorProperties.class})
@RequiredArgsConstructor
public class MallApplication {

	private final Environment environment;

	@PostConstruct
	public void init() {;
		ServiceDefine serviceDefine = new ServiceDefine(
				environment.getActiveProfiles()[0], UUID.randomUUID().toString());

		log.info("Service Define: {}, {}",
				ServiceDefine.environment, ServiceDefine.transactionId);
	}

	public static void main(String[] args) {
		SpringApplication.run(MallApplication.class, args);
	}
}
