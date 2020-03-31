package com.atguigu.myrule;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class MySelfRule
{
	@Bean
	public IRule myRule()
	{
		return new RoundRobinRule();   //轮询
		//return new RandomRule();// Ribbon默认是轮询，我自定义为随机
		//return new RandomRule_ZY();// 我自定义为每台机器5次
	}
}
