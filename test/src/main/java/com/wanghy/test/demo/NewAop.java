package com.wanghy.test.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author WangHY
 */
@Component
@Aspect
public class NewAop {

	@Pointcut(value = "execution(* com.wanghy.test.controller..*.*(..))")
	private void NewAop(){}
}
