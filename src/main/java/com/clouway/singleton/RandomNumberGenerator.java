package com.clouway.singleton;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */

public class RandomNumberGenerator  implements Generator{
    private final Random random;

    public RandomNumberGenerator() {
        Logger.getLogger("lazySingleton").log(Level.INFO, "RNG was initialized");
        random = new Random();
    }

    public Integer generate() {
        return random.nextInt();
    }
}
