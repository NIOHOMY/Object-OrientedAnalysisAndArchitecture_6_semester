import core.usecases.SubTextSearcher.SearchStrategies.SearchCharacters;
import core.usecases.SubTextSearcher.SearchStrategies.SearchDigit;
import core.usecases.SubTextSearcher.SearchStrategies.SearchText;

import core.usecases.SubTextSearcher.SubTextSearcher;
import core.usecases.entities.InputReader;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {
        String text = "This is a test № 5 for searching substring";

        SubTextSearcher searcher = new SubTextSearcher(new SearchText());

        InputReader inputReader = new InputReader();

        String subString;
        int choice = 0;

        do {
            System.out.println("Меню выбора действий:");
            System.out.println("1. Выбрать стратегию поиска");
            System.out.println("2. Выполнить поиск");
            System.out.println("3. Вывести информацию о текущей стратегии");
            System.out.println("0. Выход");
            System.out.print("Введите номер действия: ");

            try {
                choice = inputReader.readIntFromConsole();

                switch (choice) {
                    case 1:
                        System.out.println("Выберите стратегию поиска:");
                        System.out.println("1. Поиск текста");
                        System.out.println("2. Поиск цифры");
                        System.out.println("3. Поиск специального символа");
                        int strategyChoice = inputReader.readIntFromConsole();
                        switch (strategyChoice) {
                            case 1:
                                searcher.setPattern(new SearchText());
                                break;
                            case 2:
                                searcher.setPattern(new SearchDigit());
                                break;
                            case 3:
                                searcher.setPattern(new SearchCharacters());
                                break;
                            default:
                                System.out.println("Неверный выбор стратегии.");
                        }
                        break;
                    case 2:
                        System.out.print("Введите данные для поиска: ");
                        subString = inputReader.readStringFromConsole();
                        int index = searcher.search(text, subString);
                        System.out.println("Результат поиска: " + index);
                        break;
                    case 3:
                        System.out.println("Выберите информацию текущей стратегии:");
                        System.out.println("1. Название ");
                        System.out.println("2. Алгоритм");
                        System.out.println("3. Время выполнения");
                        int infoChoice = inputReader.readIntFromConsole();
                        switch (infoChoice) {
                            case 1:
                                searcher.printName();
                                break;
                            case 2:
                                searcher.printAlgorithm();
                                break;
                            case 3:
                                searcher.printTimeOfWork();
                                break;
                            default:
                                System.out.println("Неверный выбор информации.");
                        }
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