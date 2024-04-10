package lab1_StrategyAndTemplate.core.usecases.entities.SubTextSearcher.SearchStrategies;


import lab1_StrategyAndTemplate.core.usecases.abstracttions.SearchStrategy;

public class SearchDigit extends SearchStrategy {
    @Override
    public int search(String text, String subString) {
        long startTime = System.nanoTime();
        int index = performSearch(text, subString);
        long endTime = System.nanoTime();
        this.elapsedTime = endTime - startTime;
        return index;
    }

    private int performSearch(String text, String subString) {
        if (subString.length() != 1 || !Character.isDigit(subString.charAt(0))) {
            return -1;
        }

        char digitToFind = subString.charAt(0);

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == digitToFind) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public void printName() {
        System.out.println("SearchDigit");
    }

    @Override
    public void printAlgorithm() {
        System.out.println("Алгоритм" +
                "\n* Проверяет длинну подстроки и определяет является ли она цифрой " +
                "\n* Если проверка прошла успешно он ищет цифру, поданную на вход, и возвращает индекс её первого вхождения в тексте" +
                "\n* В случае неудачи при проверке или отсутствия цифры в тексте возвращает -1");
    }

    @Override
    public void printTimeOfWork() {
        System.out.println("Время работы алгоритма: " + elapsedTime + " наносек");
    }
}
