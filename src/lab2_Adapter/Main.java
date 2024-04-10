package lab2_Adapter;

import global.entities.InputReader;
import lab2_Adapter.core.entities.games.BirdRockWaterGameAdapter;
import lab2_Adapter.core.entities.games.RockScissorsPaper;
import lab2_Adapter.core.entities.interfaces.Game;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        InputReader inputReader = new InputReader();

        String subString;
        int choice = 0;

        Game game = new RockScissorsPaper();
        do {
            System.out.println("Меню выбора действий:");
            System.out.println("1. Выбрать игру");
            System.out.println("2. Играть");
            System.out.println("0. Выход");
            System.out.print("Введите номер действия: ");

            try {
                choice = inputReader.readIntFromConsole();

                switch (choice) {
                    case 1:
                        System.out.println("Выберите игру:");
                        System.out.println("1. Камень ножницы бумага");
                        System.out.println("2. Птица вода камень");
                        int strategyChoice = inputReader.readIntFromConsole();
                        switch (strategyChoice) {
                            case 1:
                                game = new RockScissorsPaper();
                                break;
                            case 2:
                                game = new BirdRockWaterGameAdapter();
                                break;
                            default:
                                System.out.println("Неверный выбор игры.");
                        }
                        break;
                    case 2:
                        System.out.print("Сделайте выбор: ");
                        subString = inputReader.readStringFromConsole();
                        game.play(subString);
                        break;

                    case 0:
                        System.out.println("Выход из программы.");
                        break;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
                System.out.println();

            }
            catch (InputMismatchException e) {
                System.out.println("Ошибка: введено не число. Повторите попытку.");
            }
        } while (choice != 0);

    }
}
