package com.clouway.multibind;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import com.google.inject.name.Names;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class FoodSuplierModule extends AbstractModule {
    @Override
    protected void configure() {
        Multibinder<Suplier> drinkSuplier = Multibinder.newSetBinder(binder(), Suplier.class);
        drinkSuplier.addBinding().to(FoodSuplier.class);

        bind(Company.class).annotatedWith(Names.named("Food")).toInstance(new Company("Banitsa Ltd", 19));
    }
}
