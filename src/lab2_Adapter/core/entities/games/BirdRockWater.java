package lab2_Adapter.core.entities.games;

import lab2_Adapter.core.entities.random.RandomNumberGenerator;

import java.util.Random;

public class BirdRockWater {
    String[] options = {"камень", "птица", "вода"};
    RandomNumberGenerator randomNumberGenerator;

    public BirdRockWater(){
        randomNumberGenerator = new RandomNumberGenerator();
    }
    public String playBirdRockWater(String userChoice) {

        if (!isValidChoice(userChoice)) {
            System.out.println("Такого выбора в игре нет!");
            return "Такого выбора в игре нет!";
        }

        int index = randomNumberGenerator.generateRandomNumber(0, options.length-1);
        String computerChoice = options[index];

        System.out.println("Я выбрал: " + computerChoice);

        String result = "";
        if (userChoice.equals(computerChoice)) {
            result = "Ничья!";
            System.out.println("Ничья!");
        } else if ((userChoice.equals("камень") && computerChoice.equals("птица")) ||
                (userChoice.equals("птица") && computerChoice.equals("вода")) ||
                (userChoice.equals("вода") && computerChoice.equals("камень"))) {
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
