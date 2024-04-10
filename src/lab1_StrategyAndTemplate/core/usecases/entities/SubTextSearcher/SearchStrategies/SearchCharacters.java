package lab1_StrategyAndTemplate.core.usecases.entities.SubTextSearcher.SearchStrategies;


import lab1_StrategyAndTemplate.core.usecases.abstracttions.SearchStrategy;

public class SearchCharacters extends SearchStrategy {

    private static final char[] specialCharacters = { '!','@','#','$','%',
            '^','&','*','(',')',
            '-','+','=','.',',',
            '/','?',';',':','{',
            '}','[',']','<','>',
            '№',
    };
    @Override
    public int search(String text, String subString) {
        long startTime = System.nanoTime();
        int index = performSearch(text, subString);
        long endTime = System.nanoTime();
        this.elapsedTime = (endTime - startTime);
        return index;
    }

    private int performSearch(String text, String subString) {
        // return text.indexOf(subText.charAt(0));
        if (subString.length() != 1 || !isSpecialCharacter(subString.charAt(0))) {
            return -1;
        }

        char specialCharToFind = subString.charAt(0);

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == specialCharToFind) {
                return i;
            }
        }
        return -1;
    }

    private boolean isSpecialCharacter(char c) {
        for (char specialChar : specialCharacters) {
            if (c == specialChar) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printName() {
        System.out.println("SearchCharacters");
    }

    @Override
    public void printAlgorithm() {
        System.out.println("Алгоритм" +
                "\n* Проверяет длинну подстроки и определение является ли спецсимволом, " +
                "\n* Если проверка прошла успешно он ищет специальный символ, поданный на вход, и возвращает индекс его первого вхождения в тексте" +
                "\n* В случае неудачи при проверке или отсутствия символа в тексте возвращает -1");
    }

    @Override
    public void printTimeOfWork() {
        System.out.println("Время работы алгоритма: " + elapsedTime + " наносек");
    }
}
