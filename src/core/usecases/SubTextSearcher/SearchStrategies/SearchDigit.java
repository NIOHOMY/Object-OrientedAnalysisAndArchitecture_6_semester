package core.usecases.SubTextSearcher.SearchStrategies;

import core.usecases.interfaces.SearchStrategy;

public class SearchDigit implements SearchStrategy {
    @Override
    public int search(String text, String subText) {
        if (subText.length() != 1 || !Character.isDigit(subText.charAt(0))) {
            return -1;
        }

        char digitToFind = subText.charAt(0);

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == digitToFind) {
                return i;
            }
        }

        return -1;
    }
}
