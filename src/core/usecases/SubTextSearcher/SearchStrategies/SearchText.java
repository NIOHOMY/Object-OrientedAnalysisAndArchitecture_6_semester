package core.usecases.SubTextSearcher.SearchStrategies;

import core.usecases.interfaces.SearchStrategy;

public class SearchText implements SearchStrategy {
    @Override
    public int search(String text, String subText) {
        // return text.indexOf(subText);

        if (subText.isEmpty()) {
            return -1;
        }

        char[] textArray = text.toCharArray();
        char[] subtextArray = subText.toCharArray();

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
}
