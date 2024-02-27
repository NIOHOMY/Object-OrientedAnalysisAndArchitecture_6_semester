import core.usecases.SubTextSearcher.SearchStrategies.SearchCharacters;
import core.usecases.SubTextSearcher.SearchStrategies.SearchDigit;
import core.usecases.SubTextSearcher.SearchStrategies.SearchText;

import core.usecases.SubTextSearcher.SubTextSearcher;

public class Main {
    public static void main(String[] args)
    {
        String text = "This is a test № 5 for searching subtext";
        String subText1 = "test";
        String subText2 = "5";
        String subText3 = "№";

        SubTextSearcher searcher = new SubTextSearcher(new SearchText());

        int index1 = searcher.search(text, subText1);
        System.out.println("Subtext \"" + subText1 + "\" found at index: " + index1);

        searcher.setPattern(new SearchDigit());

        int index2 = searcher.search(text, subText2);
        System.out.println("Digit \"" + subText2 + "\" found at index: " + index2);

        searcher.setPattern(new SearchCharacters());

        int index3 = searcher.search(text, subText3);
        System.out.println("Special character \"" + subText3 + "\" found at index: " + index3);
    }
}