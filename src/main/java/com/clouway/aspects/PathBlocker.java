package com.clouway.aspects;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class PathBlocker implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object[] arguments = methodInvocation.getArguments();
        for (Object argument : arguments) {
            String arg = (String) argument;
            if(arg.equals("/home/clouway/.m2")) {
                throw new IllegalAccessException("Access Denied");
            }
        }
        return methodInvocation.proceed();
    }
}
