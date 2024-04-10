package lab1_StrategyAndTemplate.core.usecases.entities.SubTextSearcher;

import lab1_StrategyAndTemplate.core.usecases.abstracttions.SearchStrategy;
import lab1_StrategyAndTemplate.core.usecases.interfaces.Info;

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
