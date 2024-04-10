package lab2_Adapter.core.entities.random;

import java.util.Random;

public class RandomNumberGenerator {
    private Random random;

    public RandomNumberGenerator() {
        random = new Random();
    }

    public int generateRandomNumber(int min, int max) {
        if (min >= max) {
            int tmp = max;
            max = min;
            min = tmp;
        }

        return random.nextInt(max - min + 1) + min;
    }
}

