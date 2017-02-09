package com.clouway.multibind;

import com.google.common.collect.Lists;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(
                new DrinkSuplierModule(),
                new FoodSuplierModule()
        );

        Warehouse warehouse = injector.getInstance(Warehouse.class);
        String receipt = warehouse.receiveOrder(Lists.newArrayList(
                new Product("Food", "bread", 3),
                new Product("Drink", "cola", 32),
                new Product("Food", "salami", 15),
                new Product("Drink", "water", 6)
        ));
        System.out.println(receipt);
    }
}

