package lab2_Adapter.core.entities.games;

import lab2_Adapter.core.entities.interfaces.Game;

public class BirdRockWaterGameAdapter implements Game {
    BirdRockWater game = new BirdRockWater();
    @Override
    public String play(String userChoice) {
        return game.playBirdRockWater(userChoice);
    }
}
