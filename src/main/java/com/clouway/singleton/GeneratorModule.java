package com.clouway.singleton;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class GeneratorModule extends AbstractModule {
    protected void configure() {
        bind(Generator.class).to(RandomBooleanGenerator.class).asEagerSingleton();
        bind(Generator.class).annotatedWith(Names.named("number")).to(RandomNumberGenerator.class);
        bind(RandomNumberGenerator.class).in(Scopes.SINGLETON);
    }
}
