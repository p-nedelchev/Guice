package com.clouway.singleton;

import com.google.inject.Singleton;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
@Singleton
public class RandomBooleanGenerator implements Generator {
    private final Random random;

    public RandomBooleanGenerator() {
        Logger.getLogger("eagerSingleton").log(Level.INFO, "RBG was initialized");
        random = new Random();
    }

    public Boolean generate() {
        return random.nextBoolean();
    }
}
