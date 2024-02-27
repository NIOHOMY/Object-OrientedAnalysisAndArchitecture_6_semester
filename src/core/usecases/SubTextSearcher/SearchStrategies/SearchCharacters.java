package core.usecases.SubTextSearcher.SearchStrategies;

import core.usecases.interfaces.SearchStrategy;

public class SearchCharacters implements SearchStrategy {

    private static final char[] specialCharacters = { '!','@','#','$','%',
            '^','&','*','(',')',
            '-','+','=','.',',',
            '/','?',';',':','{',
            '}','[',']','<','>',
            '№',
    };
    @Override
    public int search(String text, String subText) {
        // return text.indexOf(subText.charAt(0));
        if (subText.length() != 1 || !isSpecialCharacter(subText.charAt(0))) {
            return -1;
        }

        char specialCharToFind = subText.charAt(0);

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
}
