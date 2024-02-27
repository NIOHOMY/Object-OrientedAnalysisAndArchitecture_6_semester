package core.usecases.SubTextSearcher;

import core.usecases.interfaces.SearchStrategy;

public class SubTextSearcher {
    private SearchStrategy searcher;

    public SubTextSearcher(SearchStrategy strategy) {
        searcher = strategy;
    }

    public void setPattern(SearchStrategy strategy) {
        searcher = strategy;
    }

    public int search(String text, String subText) {
        return searcher.search(text, subText);
    }
}
