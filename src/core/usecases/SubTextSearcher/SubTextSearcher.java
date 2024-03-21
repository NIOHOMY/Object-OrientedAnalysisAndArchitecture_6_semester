package core.usecases.SubTextSearcher;

import core.usecases.abstracttions.Info;
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

    public void printName(){
        if (searcher instanceof Info) {
            ((Info) searcher).printName();
        }
        else{
            System.out.println("Для данной стратегии не доступен просмотр информации");
        }
    }
    public void printAlgorithm(){
        if (searcher instanceof Info) {
            ((Info) searcher).printAlgorithm();
        }
        else{
            System.out.println("Для данной стратегии не доступен просмотр информации");
        }
    }
    public void printTimeOfWork(){
        if (searcher instanceof Info) {
            ((Info) searcher).printTimeOfWork();
        }
        else{
            System.out.println("Для данной стратегии не доступен просмотр информации");
        }
    }
}
