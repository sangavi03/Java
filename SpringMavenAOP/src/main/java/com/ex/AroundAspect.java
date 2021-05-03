package com.ex;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAspect implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Authentication done");
		Object ob=invocation.proceed();
		System.out.println("Logging information");
		return ob;
	}

}
