package com.rk.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"com.rk.service","com.rk.manager","com.rk.aspect"})
@EnableAspectJAutoProxy
public class AppConfig {

}
