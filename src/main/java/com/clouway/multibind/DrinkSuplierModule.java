package com.clouway.multibind;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import com.google.inject.name.Names;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class DrinkSuplierModule extends AbstractModule {
    @Override
    protected void configure() {
        Multibinder<Suplier> drinkSuplier = Multibinder.newSetBinder(binder(), Suplier.class);
        drinkSuplier.addBinding().to(DrinkSuplier.class);

        bind(Company.class).annotatedWith(Names.named("Drink")).toInstance(new Company("Soda Ltd", 14));
    }
}