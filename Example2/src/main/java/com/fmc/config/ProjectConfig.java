package com.fmc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;

import com.fmc.BridgestoneTyre;
import com.fmc.MrfTyre;

@Configuration
@ComponentScan("com.fmc")
@EnableAspectJAutoProxy
public class ProjectConfig {

	@Bean
	@Primary
	public MrfTyre mrfTyre1() {
	MrfTyre t1=new MrfTyre();
	return t1;
	}
	@Bean
	public BridgestoneTyre bridgestoneTyre() {
		BridgestoneTyre b1=new BridgestoneTyre();
		return b1;
	}
}
