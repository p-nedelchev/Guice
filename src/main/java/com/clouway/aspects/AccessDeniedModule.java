package com.clouway.aspects;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class AccessDeniedModule extends AbstractModule {
    @Override
    protected void configure() {
        bindInterceptor(Matchers.any(), Matchers.annotatedWith(AccessDenied.class), new PathBlocker());
    }
}
