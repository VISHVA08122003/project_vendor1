package com.example.spring.project.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProjectAspect {
//	@Before(value = "execution(* com.example.spring.controller.*.*(..))")
//	public void beforeAdvice() {
//		System.out.println("welcome");
//	}

	@Before(value = "execution(* com.example.spring.project.controller.ProjectController.*(..))")
	public void beforeAdvice() {
		System.out.println("hello world");
	}
	
	@Before(value = "execution(* com.example.spring.project.controller.ProjectController.getUser(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature()+"started at"+ System.currentTimeMillis());
	}
	
	@After(value = "execution(* com.example.spring.project.controller.ProjectController.getUser(..))")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature()+"after advice called"+System.currentTimeMillis());
	}

}
