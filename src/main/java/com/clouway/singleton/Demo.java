package com.clouway.singleton;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new GeneratorModule());
        System.out.println("Start:");
    }
}
