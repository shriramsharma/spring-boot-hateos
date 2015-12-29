package com.walmart.platform.spring.boot.hateos;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.playground.spring.boot.hateos.SpringBootHateosApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootHateosApplication.class)
@WebAppConfiguration
public class SpringBootHateosApplicationTests {

	@Test
	public void contextLoads() {
	}

}
