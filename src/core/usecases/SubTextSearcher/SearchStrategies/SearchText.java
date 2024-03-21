package core.usecases.SubTextSearcher.SearchStrategies;

import core.usecases.abstracttions.Info;
import core.usecases.interfaces.SearchStrategy;

public class SearchText extends Info implements SearchStrategy {
    @Override
    public int search(String text, String subString) {
        long startTime = System.nanoTime();
        int index = performSearch(text, subString);
        long endTime = System.nanoTime();
        this.elapsedTime = endTime - startTime;
        return index;
    }

    private int performSearch(String text, String subString) {
        // return text.indexOf(subText);

        if (subString.isEmpty()) {
            return -1;
        }

        char[] textArray = text.toCharArray();
        char[] subtextArray = subString.toCharArray();

        for (int i = 0; i <= textArray.length - subtextArray.length; i++)
        {
            int j = 0;
            while (j < subtextArray.length && textArray[i + j] == subtextArray[j])
            {
                ++j;
            }
            if (j == subtextArray.length)
            {
                return i;
            }
        }
        return -1;
    }
    @Override
    public void printName() {
        System.out.println("SearchText");
    }

    @Override
    public void printAlgorithm() {
        System.out.println("Алгоритм" +
                "\n* Проверяет что строка не пуста " +
                "\n* Если проверка прошла успешно он ищет подстроку, поданную на вход, и возвращает индекс её первого вхождения в тексте" +
                "\n* В случае неудачи при проверке или отсутствия подстроки в тексте возвращает -1");
    }

    @Override
    public void printTimeOfWork() {
        System.out.println("Время работы алгоритма: " + elapsedTime + " наносек");
    }
}
