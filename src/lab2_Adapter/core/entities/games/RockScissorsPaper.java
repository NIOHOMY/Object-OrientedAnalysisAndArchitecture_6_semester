package lab2_Adapter.core.entities.games;

import lab2_Adapter.core.entities.interfaces.Game;
import lab2_Adapter.core.entities.random.RandomNumberGenerator;

import java.util.Random;

public class RockScissorsPaper implements Game {

    String[] options = {"камень", "ножницы", "бумага"};
    RandomNumberGenerator randomNumberGenerator;

    public RockScissorsPaper(){
        randomNumberGenerator = new RandomNumberGenerator();
    }
    @Override
    public String play(String userChoice) {
        if (!isValidChoice(userChoice)) {
            System.out.println("Такого выбора в игре нет!");
            return "Такого выбора в игре нет!";
        }

        int index = randomNumberGenerator.generateRandomNumber(0,options.length-1);
        String computerChoice = options[index];

        System.out.println("Я выбрал: " + computerChoice);

        String result = "";
        if (userChoice.equals(computerChoice)) {
            result = "Ничья!";
            System.out.println("Ничья!");
        } else if ((userChoice.equals("камень") && computerChoice.equals("ножницы")) ||
                (userChoice.equals("ножницы") && computerChoice.equals("бумага")) ||
                (userChoice.equals("бумага") && computerChoice.equals("камень"))) {
            result = "Вы выиграли!";
            System.out.println("Вы выиграли!");
        } else {
            result = "Вы проиграли!";
            System.out.println("Вы проиграли!");
        }

        return result;
    }

    private boolean isValidChoice(String choice) {
        for (String option : options) {
            if (option.equals(choice)) {
                return true;
            }
        }
        return false;
    }
}
